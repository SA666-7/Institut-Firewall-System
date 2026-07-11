public class SecurityAssessment {

    private int securityScore;
    private String riskLevel;

    public SecurityAssessment(int securityScore) {
        this.securityScore = securityScore;
        calculateRiskLevel();
    }

    private void calculateRiskLevel() {

        if (securityScore >= 80) {
            riskLevel = "Low Risk";
        } 
        else if (securityScore >= 50) {
            riskLevel = "Medium Risk";
        } 
        else {
            riskLevel = "High Risk";
        }
    }


    public void displayAssessment() {

        System.out.println("Security Assessment:");
        System.out.println("Security Score: " + securityScore + "%");
        System.out.println("Risk Level: " + riskLevel);

    }
}
