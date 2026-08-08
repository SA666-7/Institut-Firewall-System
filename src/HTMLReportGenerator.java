import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HTMLReportGenerator {

    public void generateHTML(SecurityAssessment assessment,
                             ArrayList<String> recommendations,
                             int deviceCount,
                             int firewallRuleCount,
                             ArrayList<String> trafficResults) {

        try {

            File file = new File("C:\\Users\\سـاره\\Desktop\\SecurityReport.html");

            FileWriter writer = new FileWriter(file);

            writer.write("<!DOCTYPE html>");
            writer.write("<html>");

            // CSS Styling
            writer.write("<head>");
            writer.write("<title>Firewall Security Report</title>");

            writer.write("<style>");

            writer.write("body { font-family: Arial; background-color: #f4f6f7; margin: 30px; }");

            writer.write("h1 { color: #1f4e79; text-align: center; }");

            writer.write("h2 { color: #2e75b6; }");

            writer.write("hr { border: 1px solid #cccccc; }");

            writer.write("table { width: 80%; border-collapse: collapse; margin-bottom: 20px; }");

            writer.write("th { background-color: #1f4e79; color: white; padding: 10px; }");

            writer.write("td { padding: 10px; text-align: center; background-color: white; }");

            writer.write("tr:nth-child(even) td { background-color: #eaf2f8; }");

            writer.write("ol { background-color: white; padding: 20px; width: 70%; }");

            writer.write("li { margin: 10px; font-size: 16px; }");

            writer.write("</style>");

            writer.write("</head>");


            writer.write("<body>");

            writer.write("<h1>Firewall Security Report</h1>");

            writer.write("<hr>");


            // ==========================================
            // Network Information
            // ==========================================

            writer.write("<h2>Network Information</h2>");

            writer.write("<table>");

            writer.write("<tr>");
            writer.write("<th>Information</th>");
            writer.write("<th>Value</th>");
            writer.write("</tr>");

            writer.write("<tr>");
            writer.write("<td>Number of Devices</td>");
            writer.write("<td>" + deviceCount + "</td>");
            writer.write("</tr>");

            writer.write("<tr>");
            writer.write("<td>Number of Firewall Rules</td>");
            writer.write("<td>" + firewallRuleCount + "</td>");
            writer.write("</tr>");

            writer.write("</table>");


            writer.write("<hr>");


            // ==========================================
            // Firewall Simulation Results
            // ==========================================

            writer.write("<h2>Firewall Simulation Results</h2>");

            writer.write("<table>");

            writer.write("<tr>");
            writer.write("<th>Source IP</th>");
            writer.write("<th>Destination IP</th>");
            writer.write("<th>Port</th>");
            writer.write("<th>Protocol</th>");
            writer.write("<th>Result</th>");
            writer.write("</tr>");


            for (String result : trafficResults) {

                String[] data = result.split(",");

                writer.write("<tr>");

                for (String item : data) {
                    writer.write("<td>" + item.trim() + "</td>");
                }

                writer.write("</tr>");
            }

            writer.write("</table>");


            writer.write("<hr>");


            // ==========================================
            // Security Assessment
            // ==========================================

            writer.write("<h2>Security Assessment</h2>");

            writer.write("<table>");

            writer.write("<tr>");
            writer.write("<th>Security Score</th>");
            writer.write("<th>Risk Level</th>");
            writer.write("</tr>");

            writer.write("<tr>");

            writer.write("<td>"
                    + assessment.getSecurityScore()
                    + "/100</td>");

            writer.write("<td>"
                    + assessment.getRiskLevel()
                    + "</td>");

            writer.write("</tr>");

            writer.write("</table>");


            writer.write("<hr>");


            // ==========================================
            // Security Recommendations
            // ==========================================

            writer.write("<h2>Security Recommendations</h2>");

            /*
             * Add additional security recommendations based on:
             * - Network device roles
             * - Firewall rules
             * - Protocols and ports used in the simulation
             */

            ArrayList<String> finalRecommendations = new ArrayList<>();

            // Add existing recommendations first
            if (recommendations != null) {
                finalRecommendations.addAll(recommendations);
            }


            // Recommendation 1
            String recommendation1 = "Isolate Guest Network.";
            if (!finalRecommendations.contains(recommendation1)) {
                finalRecommendations.add(recommendation1);
            }


            // Recommendation 2
            String recommendation2 = "Use Strong Passwords.";
            if (!finalRecommendations.contains(recommendation2)) {
                finalRecommendations.add(recommendation2);
            }


            // Recommendation 3
            String recommendation3 =
                    "Separate Student and Administrator Networks.";
            if (!finalRecommendations.contains(recommendation3)) {
                finalRecommendations.add(recommendation3);
            }


            // Recommendation 4
            String recommendation4 =
                    "Use HTTPS instead of HTTP whenever possible.";
            if (!finalRecommendations.contains(recommendation4)) {
                finalRecommendations.add(recommendation4);
            }


            // Recommendation 5
            String recommendation5 =
                    "Allow SSH only for authorized users and trusted devices.";
            if (!finalRecommendations.contains(recommendation5)) {
                finalRecommendations.add(recommendation5);
            }


            // Recommendation 6
            String recommendation6 =
                    "Keep Telnet blocked and use SSH as a secure alternative.";
            if (!finalRecommendations.contains(recommendation6)) {
                finalRecommendations.add(recommendation6);
            }


            // Recommendation 7
            String recommendation7 =
                    "Restrict HTTPS access to required services only.";
            if (!finalRecommendations.contains(recommendation7)) {
                finalRecommendations.add(recommendation7);
            }


            // Recommendation 8
            String recommendation8 =
                    "Review firewall rules regularly and remove unnecessary rules.";
            if (!finalRecommendations.contains(recommendation8)) {
                finalRecommendations.add(recommendation8);
            }


            // Recommendation 9
            String recommendation9 =
                    "Enable network traffic logging and monitor denied connections.";
            if (!finalRecommendations.contains(recommendation9)) {
                finalRecommendations.add(recommendation9);
            }


            // Display all recommendations
            writer.write("<ol>");

            for (String recommendation : finalRecommendations) {

                writer.write("<li>"
                        + recommendation
                        + "</li>");
            }

            writer.write("</ol>");


            // ==========================================
            // End of Report
            // ==========================================

            writer.write("</body>");
            writer.write("</html>");

            writer.close();


            System.out.println("HTML Report Created Successfully.");
            System.out.println("Report Path: " + file.getAbsolutePath());
            System.out.println("File Exists: " + file.exists());


        } catch (IOException e) {

            System.out.println("Error creating HTML report.");
            e.printStackTrace();

        }

    }
}
