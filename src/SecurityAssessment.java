import java.util.ArrayList;

public class SecurityAssessment {

    private int securityScore;
    private String riskLevel;

    public SecurityAssessment() {
        securityScore = 0;
    }

    public void calculateScore(ArrayList<AssessmentCriteria> criteria) {

        securityScore = 0;

        for (AssessmentCriteria c : criteria) {

            if (c.isPassed()) {
                securityScore += c.getScore();
            }

        }

        calculateRiskLevel();
    }

    private void calculateRiskLevel() {

        if (securityScore >= 80)
            riskLevel = "Low";

        else if (securityScore >= 60)
            riskLevel = "Medium";

        else if (securityScore >= 40)
            riskLevel = "High";

        else
            riskLevel = "Critical";
    }

    public int getSecurityScore() {
        return securityScore;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void displayAssessment() {

        System.out.println("Security Score : " + securityScore + "/100");
        System.out.println("Risk Level : " + riskLevel);

    }
}
