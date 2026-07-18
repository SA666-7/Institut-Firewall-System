import java.util.ArrayList;

public class ReportGenerator {

    public void generateReport(SecurityAssessment assessment,
                               ArrayList<SecurityRecommendation> recommendations) {

        System.out.println("========== Security Report ==========");

        System.out.println("Security Score : "
                + assessment.getSecurityScore() + "/100");

        System.out.println("Risk Level : "
                + assessment.getRiskLevel());

        System.out.println();

        System.out.println("Recommendations:");

        for (SecurityRecommendation r : recommendations) {
            r.displayRecommendation();
        }

        System.out.println("=====================================");
    }
}
