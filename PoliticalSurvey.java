import java.util.Scanner;

class PoliticalSurvey {
    private static final Scanner scanner = new Scanner(System.in);
    private static int democraticScore = 0;
    private static int republicanScore = 0;
    private static int libertarianScore = 0;
    private static int independentScore = 0;

    public void runSurvey() {
        String[][][] allQuestions = PoliticalSurveyQuestions.getQuestions();
        String[] responses = new String[allQuestions.length];
        String userId = "user_" + System.currentTimeMillis();

        System.out.println("Political Affiliation Survey");
        System.out.println("Please answer with A, B, C, or D for each question.\n");

        for (int i = 0; i < allQuestions.length; i++) {
            responses[i] = conductSurvey(allQuestions[i], i + 1, allQuestions.length);
            updateScores(responses[i], i);

            if (i >= 4) { // Start predicting after 5 questions
                String prediction = getPrediction();
                System.out.println("\nCurrent prediction: " + prediction);
                System.out.println("----------------------------------");
            }
        }

        String finalPrediction = getPrediction();
        System.out.println("\nFinal Prediction: " + finalPrediction);

        // Save responses
        SurveyResponse response = new SurveyResponse(userId, responses);
        response.setPredictedParty(finalPrediction);
        DataStorage.saveResponse(response, finalPrediction);
    }

    private String conductSurvey(String[][] question, int questionNumber, int totalQuestions) {
        System.out.println("\nQuestion " + questionNumber + "/" + totalQuestions);
        System.out.println(question[0][0]);

        for (int i = 0; i < question[1].length; i++) {
            System.out.println((char) ('A' + i) + ") " + question[1][i]);
        }

        return getValidResponse();
    }

    private void updateScores(String answer, int questionIndex) {
        int answerIndex = answer.charAt(0) - 'A';
        int partyIndex = PoliticalSurveyQuestions.ANSWER_KEY[questionIndex][answerIndex];
        double weight = PoliticalSurveyQuestions.getQuestionWeight(questionIndex);

        switch (partyIndex) {
            case 0:
                democraticScore += weight;
                break;
            case 1:
                libertarianScore += weight;
                break;
            case 2:
                republicanScore += weight;
                break;
            case 3:
                independentScore += weight;
                break;
        }
    }

    private String getPrediction() {
        int max = Math.max(Math.max(democraticScore, republicanScore),
                Math.max(libertarianScore, independentScore));

        if (max == democraticScore)
            return "Democrat";
        if (max == republicanScore)
            return "Republican";
        if (max == libertarianScore)
            return "Libertarian";
        return "Independent";
    }

    private String getValidResponse() {
        while (true) {
            System.out.print("Your answer (A-D): ");
            String response = scanner.nextLine().trim().toUpperCase();
            if (response.matches("[A-D]")) {
                return response;
            }
            System.out.println("Invalid input. Please enter A, B, C, or D.");
        }
    }
}