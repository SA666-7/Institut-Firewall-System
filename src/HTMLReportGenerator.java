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

            FileWriter writer = new FileWriter("C:\\Users\\سـاره\\Desktop\\SecurityReport.html");

            writer.write("<!DOCTYPE html>");
            writer.write("<html>");
            writer.write("<head>");
            writer.write("<title>Firewall Security Report</title>");
            writer.write("</head>");

            writer.write("<body style='font-family:Arial;'>");

            writer.write("<h1>Firewall Security Report</h1>");

            writer.write("<hr>");

            // Network Information
            writer.write("<h2>Network Information</h2>");
            writer.write("<p><b>Number of Devices:</b> " + deviceCount + "</p>");
            writer.write("<p><b>Number of Firewall Rules:</b> " + firewallRuleCount + "</p>");

            writer.write("<hr>");

            // Firewall Simulation Results
            writer.write("<h2>Firewall Simulation Results</h2>");

            writer.write("<table border='1' cellspacing='0' cellpadding='8'>");

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

            writer.write("<p><b>Security Score:</b> "
                    + assessment.getSecurityScore()
                    + "/100</p>");

            writer.write("<p><b>Risk Level:</b> "
                    + assessment.getRiskLevel()
                    + "</p>");

            writer.write("<hr>");

            // Security Recommendations
            writer.write("<h2>Security Recommendations</h2>");

            writer.write("<ul>");

            for (String recommendation : recommendations) {
                writer.write("<li>" + recommendation + "</li>");
            }

            writer.write("</ul>");

            writer.write("</body>");
            writer.write("</html>");

            writer.close();

            System.out.println("HTML Report Created Successfully.");

        } catch (IOException e) {

            System.out.println("Error creating HTML report.");
            e.printStackTrace();
        }

    }
}
