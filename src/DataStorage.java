import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataStorage {

    public static void saveResults(ArrayList<Device> devices,
                                   ArrayList<String> firewallRules,
                                   ArrayList<String> trafficLogs,
                                   SecurityAssessment assessment) {

        try {

            FileWriter writer = new FileWriter("SecurityResults.txt");

            writer.write("===== Devices =====\n");

            for (Device device : devices) {
                writer.write(device.toString() + "\n");
            }


            writer.write("\n===== Firewall Rules =====\n");

            for (String rule : firewallRules) {
                writer.write(rule + "\n");
            }


            writer.write("\n===== Traffic Logs =====\n");

            for (String log : trafficLogs) {
                writer.write(log + "\n");
            }


            writer.write("\n===== Security Assessment =====\n");

            writer.write("Security Score: "
                    + assessment.getSecurityScore()
                    + "/100\n");

            writer.write("Risk Level: "
                    + assessment.getRiskLevel()
                    + "\n");


            writer.close();

            System.out.println("Security Results Saved Successfully.");

        } catch (IOException e) {

            System.out.println("Error Saving Results.");
            e.printStackTrace();

        }
    }
}
