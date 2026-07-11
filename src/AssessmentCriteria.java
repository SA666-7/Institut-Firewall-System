public class AssessmentCriteria {

    private String criterionName;
    private int score;
    private String status;

    public AssessmentCriteria(String criterionName, int score, String status) {
        this.criterionName = criterionName;
        this.score = score;
        this.status = status;
    }

    public String getCriterionName() {
        return criterionName;
    }

    public int getScore() {
        return score;
    }

    public String getStatus() {
        return status;
    }

    public void displayCriteria() {
        System.out.println("Assessment Criterion: " + criterionName);
        System.out.println("Score: " + score);
        System.out.println("Status: " + status);
    }
}
