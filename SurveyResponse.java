class SurveyResponse {
    private String userId;
    private String[] answers;
    private String predictedParty;

    public SurveyResponse(String userId, String[] answers) {
        this.userId = userId;
        this.answers = answers;
    }

    public String getUserId() {
        return userId;
    }

    public String toCSV() {
        return String.join(",", answers);
    }

    public void setPredictedParty(String party) {
        this.predictedParty = party;
    }

    public String getPredictedParty() {
        return predictedParty;
    }
}