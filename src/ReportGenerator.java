import java.util.ArrayList;

public class ReportGenerator {

    public void generateReport(SecurityAssessment assessment,
                               ArrayList<String> recommendations) {

        System.out.println("========== Security Report ==========");

        System.out.println("Security Score : "
                + assessment.getSecurityScore() + "/100");

        System.out.println("Risk Level : "
                + assessment.getRiskLevel());

        System.out.println();

        System.out.println("Recommendations:");

        if (recommendations.isEmpty()) {

            System.out.println("No recommendations. The network is secure.");

        } else {

            for (String r : recommendations) {
                System.out.println("- " + r);
            }

        }

        System.out.println("=====================================");
    }
}
