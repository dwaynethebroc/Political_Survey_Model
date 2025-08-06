import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class DataStorage {
    private static final String DEMOCRAT_FILE = "democrat_responses.csv";
    private static final String REPUBLICAN_FILE = "republican_responses.csv";
    private static final String LIBERTARIAN_FILE = "libertarian_responses.csv";
    private static final String INDEPENDENT_FILE = "independent_responses.csv";
    private static final String ALL_RESPONSES_FILE = "all_responses.csv";

    public static void saveResponse(SurveyResponse response, String party) {
        saveToFile(ALL_RESPONSES_FILE, response, party);
        saveToFile(getPartyFile(party), response, party);
    }

    private static void saveToFile(String filename, SurveyResponse response, String party) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            if (new File(filename).length() == 0) {
                writer.write("UserID,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,Q11,Q12,Q13,Q14,Q15,PredictedParty\n");
            }
            writer.write(response.getUserId() + "," + response.toCSV() + "," + party + "\n");
        } catch (IOException e) {
            System.err.println("Error saving to " + filename + ": " + e.getMessage());
        }
    }

    private static String getPartyFile(String party) {
        switch (party.toLowerCase()) {
            case "democrat":
                return DEMOCRAT_FILE;
            case "republican":
                return REPUBLICAN_FILE;
            case "libertarian":
                return LIBERTARIAN_FILE;
            case "independent":
                return INDEPENDENT_FILE;
            default:
                return "other_responses.csv";
        }
    }
}