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


            // Network Information
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


            // Firewall Simulation Results
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
                    writer.write("<td>" + item + "</td>");
                }

                writer.write("</tr>");
            }

            writer.write("</table>");


            writer.write("<hr>");


            // Security Assessment
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


            // Security Recommendations
            writer.write("<h2>Security Recommendations</h2>");

            writer.write("<ol>");

            for (String recommendation : recommendations) {

                writer.write("<li>"
                        + recommendation
                        + "</li>");
            }

            writer.write("</ol>");


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