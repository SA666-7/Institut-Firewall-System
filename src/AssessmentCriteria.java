public class AssessmentCriteria {

    private String criterionName;
    private int score;
    private boolean passed;

    public AssessmentCriteria(String criterionName, int score, boolean passed) {
        this.criterionName = criterionName;
        this.score = score;
        this.passed = passed;
    }

    public String getCriterionName() {
        return criterionName;
    }

    public int getScore() {
        return score;
    }

    public boolean isPassed() {
        return passed;
    }

    public void displayCriteria() {
        System.out.println(criterionName + " : "
                + (passed ? "Passed" : "Failed")
                + " (" + score + " points)");
    }
}
