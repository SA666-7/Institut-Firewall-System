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

            FileWriter writer = new FileWriter("SecurityReport.html");

            writer.write("<!DOCTYPE html>");
            writer.write("<html>");
            writer.write("<head>");
            writer.write("<title>Firewall Security Report</title>");
            writer.write("</head>");

            writer.write("<body style='font-family:Arial;'>");

            writer.write("<h1>Firewall Security Report</h1>");

            writer.write("<hr>");

            // معلومات الشبكة
            writer.write("<h2>Network Information</h2>");
            writer.write("<p><b>Number of Devices:</b> " + deviceCount + "</p>");
            writer.write("<p><b>Number of Firewall Rules:</b> " + firewallRuleCount + "</p>");

            writer.write("<hr>");

            // نتائج محاكاة الجدار الناري
            writer.write("<h2>Firewall Simulation Results</h2>");
            writer.write("<ul>");

            for (String result : trafficResults) {
                writer.write("<li>" + result + "</li>");
            }

            writer.write("</ul>");

            writer.write("<hr>");

            // نتائج تقييم الأمان
            writer.write("<h2>Security Assessment</h2>");

            writer.write("<p><b>Security Score:</b> "
                    + assessment.getSecurityScore()
                    + "/100</p>");

            writer.write("<p><b>Risk Level:</b> "
                    + assessment.getRiskLevel()
                    + "</p>");

            writer.write("<hr>");

            // التوصيات
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

        }

    }

}
