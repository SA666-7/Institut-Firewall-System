public class Main {

    public static void main(String[] args) {

        // Create users
        Admin admin = new Admin("admin", "admin123");
        Student student = new Student("student1", "123456");

        // Login
        LoginManager loginManager = new LoginManager();

        boolean loginSuccess = loginManager.login(
                admin,
                "admin",
                "admin123"
        );

        if (loginSuccess) {

            // Create devices
            Device adminDevice = new Device(
                    "Admin-PC",
                    "Administration",
                    "192.168.1.10"
            );

            Device server = new Device(
                    "Internal-Server",
                    "Server",
                    "192.168.1.20"
            );

            Device guest = new Device(
                    "Guest-PC",
                    "Guest",
                    "192.168.1.30"
            );

            // Create firewall
            Firewall firewall = new Firewall();

            // Add rules
            FirewallRule rule1 = new FirewallRule(
                    "Admin-PC",
                    "Internal-Server",
                    "Allow",
                    "HTTP"
            );

            FirewallRule rule2 = new FirewallRule(
                    "Guest-PC",
                    "Internal-Server",
                    "Deny",
                    "HTTP"
            );

            firewall.addRule(rule1);
            firewall.addRule(rule2);

            // Test traffic
            boolean adminConnection = firewall.checkConnection(
                    "Admin-PC",
                    "Internal-Server"
            );

            Traffic traffic1 = new Traffic(
                    "Admin-PC",
                    "Internal-Server",
                    adminConnection ? "Allowed" : "Blocked"
            );

            boolean guestConnection = firewall.checkConnection(
                    "Guest-PC",
                    "Internal-Server"
            );

            Traffic traffic2 = new Traffic(
                    "Guest-PC",
                    "Internal-Server",
                    guestConnection ? "Allowed" : "Blocked"
            );

            // Display traffic
            traffic1.displayTraffic();
            System.out.println("----------------");
            traffic2.displayTraffic();

            // Security Assessment
            SecurityAssessment assessment = new SecurityAssessment(85);
            assessment.displayAssessment();

            // Generate Report
            ReportGenerator report = new ReportGenerator();
            report.generateReport();
        }
    }
}
