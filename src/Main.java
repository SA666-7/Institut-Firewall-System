public class Main {

    public static void main(String[] args) {

        // Create devices
        Device admin = new Device(
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


        // Display results

        traffic1.displayTraffic();
        System.out.println("----------------");

        traffic2.displayTraffic();

    }
}
