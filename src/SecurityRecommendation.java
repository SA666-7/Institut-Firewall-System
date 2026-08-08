import java.util.ArrayList;

public class SecurityRecommendation {

    public ArrayList<String> generateRecommendations(ArrayList<AssessmentCriteria> criteria) {

        ArrayList<String> recommendations = new ArrayList<>();

        for (AssessmentCriteria c : criteria) {

            if (!c.isPassed()) {

                switch (c.getCriterionName()) {

                    case "Enable Default Deny":
                        recommendations.add("Enable Default Deny Policy.");
                        break;

                    case "Disable Telnet":
                        recommendations.add("Disable Telnet Service.");
                        break;

                    case "Guest Network Isolation":
                        recommendations.add("Isolate Guest Network.");
                        break;

                    case "Firewall Review":
                        recommendations.add("Review Firewall Rules Regularly.");
                        break;

                    case "No Suspicious Traffic":
                        recommendations.add("Investigate Suspicious Traffic.");
                        break;

                    case "Protect Internal Server":
                        recommendations.add("Protect Internal Server.");
                        break;

                    case "Restrict Printer Access":
                        recommendations.add("Restrict Printer Access.");
                        break;

                    case "Control Internet Access":
                        recommendations.add("Control Internet Access.");
                        break;

                    case "Strong Passwords":
                        recommendations.add("Use Strong Passwords.");
                        break;

                    case "Enable Event Logging":
                        recommendations.add("Enable Event Logging.");
                        break;
                }
            }
        }

        return recommendations;
    }
}
