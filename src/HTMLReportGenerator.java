import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HTMLReportGenerator {

    public void generateHTML(SecurityAssessment assessment,
                             ArrayList<String> recommendations) {

        try {

            FileWriter writer = new FileWriter("SecurityReport.html");

            writer.write("<!DOCTYPE html>");
            writer.write("<html>");
            writer.write("<head>");
            writer.write("<title>Security Report</title>");
            writer.write("</head>");

            writer.write("<body>");

            writer.write("<h1>Firewall Security Report</h1>");

            writer.write("<h2>Security Score: "
                    + assessment.getSecurityScore()
                    + "/100</h2>");

            writer.write("<h2>Risk Level: "
                    + assessment.getRiskLevel()
                    + "</h2>");

            writer.write("<h3>Recommendations</h3>");

            writer.write("<ul>");

            for(String r : recommendations){
                writer.write("<li>" + r + "</li>");
            }

            writer.write("</ul>");

            writer.write("</body>");
            writer.write("</html>");

            writer.close();

            System.out.println("HTML Report Created Successfully.");

        }

        catch(IOException e){

            System.out.println("Error creating HTML report.");

        }

    }

}
