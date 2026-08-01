import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ==========================
        // أولاً: محاكاة الجدار الناري
        // ==========================

        EngineFirewall firewall = new EngineFirewall();

        // ==========================
        // إنشاء أجهزة الشبكة
        // ==========================

        Device gateway = new Device(
                "Gateway-router",
                "Router",
                "192.168.1.1"
        );

        Device coreSwitch = new Device(
                "Core-switch",
                "Switch",
                "192.168.1.2"
        );

        Device webServer = new Device(
                "Web-server-01",
                "Server",
                "192.168.1.10"
        );

        Device admin = new Device(
                "Admin-PC",
                "Administrator",
                "192.168.1.50"
        );

        Device guest = new Device(
                "Guest-laptop",
                "Guest",
                "192.168.1.105"
        );

        Device student = new Device(
                "Student-PC",
                "Student",
                "192.168.1.60"
        );

        Device printer = new Device(
                "Network-Printer",
                "Printer",
                "192.168.1.70"
        );

        // عرض الأجهزة

        System.out.println("===== Network Devices =====");

        gateway.displayInfo();
        System.out.println();

        coreSwitch.displayInfo();
        System.out.println();

        webServer.displayInfo();
        System.out.println();

        admin.displayInfo();
        System.out.println();

        guest.displayInfo();
        System.out.println();

        student.displayInfo();
        System.out.println();

        printer.displayInfo();
        System.out.println();

        // ==========================
        // إنشاء قواعد الجدار الناري
        // ==========================

        FirewallRule rule1 = new FirewallRule(
                "192.168.1.50",
                "192.168.1.10",
                80,
                "TCP",
                "Allow"
        );

        FirewallRule rule2 = new FirewallRule(
                "192.168.1.60",
                "192.168.1.10",
                80,
                "TCP",
                "Deny"
        );

        FirewallRule rule3 = new FirewallRule(
                "192.168.1.105",
                "192.168.1.10",
                22,
                "SSH",
                "Allow"
        );

        FirewallRule rule4 = new FirewallRule(
                "192.168.1.105",
                "192.168.1.10",
                23,
                "Telnet",
                "Deny"
        );

        FirewallRule rule5 = new FirewallRule(
                "192.168.1.70",
                "192.168.1.10",
                443,
                "HTTPS",
                "Allow"
        );

        firewall.addRule(rule1);
        firewall.addRule(rule2);
        firewall.addRule(rule3);
        firewall.addRule(rule4);
        firewall.addRule(rule5);

        firewall.displayRules();

        System.out.println();
        // ==========================
        // إنشاء حزم البيانات
        // ==========================

        Packet p1 = new Packet(
                "192.168.1.50",
                "192.168.1.10",
                80,
                "TCP",
                "HTTP",
                ""
        );

        Packet p2 = new Packet(
                "192.168.1.60",
                "192.168.1.10",
                80,
                "TCP",
                "HTTP",
                ""
        );

        // جهاز غير معروف
        Packet p3 = new Packet(
                "192.168.1.99",
                "192.168.1.10",
                80,
                "TCP",
                "HTTP",
                ""
        );

        Packet p4 = new Packet(
                "192.168.1.105",
                "192.168.1.10",
                22,
                "SSH",
                "SSH Service",
                ""
        );

        Packet p5 = new Packet(
                "192.168.1.105",
                "192.168.1.10",
                23,
                "Telnet",
                "Telnet Service",
                ""
        );

        Packet p6 = new Packet(
                "192.168.1.70",
                "192.168.1.10",
                443,
                "HTTPS",
                "Web Service",
                ""
        );

        // ==========================
        // عرض نتائج المحاكاة
        // ==========================

        System.out.println("===== Firewall Simulation =====");

        System.out.println("Packet 1 Result: " + firewall.checkPacket(p1));
        System.out.println("Packet 2 Result: " + firewall.checkPacket(p2));
        System.out.println("Packet 3 Result: " + firewall.checkPacket(p3));
        System.out.println("Packet 4 Result: " + firewall.checkPacket(p4));
        System.out.println("Packet 5 Result: " + firewall.checkPacket(p5));
        System.out.println("Packet 6 Result: " + firewall.checkPacket(p6));

        System.out.println();

        // ==========================
        // ثانياً: تقييم مستوى الأمان
        // ==========================

        ArrayList<AssessmentCriteria> criteria = new ArrayList<>();

        criteria.add(new AssessmentCriteria("Enable Default Deny", 20, true));
        criteria.add(new AssessmentCriteria("Disable Telnet", 15, true));
        criteria.add(new AssessmentCriteria("Guest Network Isolation", 15, false));
        criteria.add(new AssessmentCriteria("Firewall Review", 10, true));
        criteria.add(new AssessmentCriteria("No Suspicious Traffic", 10, true));
        criteria.add(new AssessmentCriteria("Protect Internal Server", 10, true));
        criteria.add(new AssessmentCriteria("Restrict Printer Access", 5, true));
        criteria.add(new AssessmentCriteria("Control Internet Access", 5, true));
        criteria.add(new AssessmentCriteria("Strong Passwords", 5, false));
        criteria.add(new AssessmentCriteria("Enable Event Logging", 5, true));

        System.out.println("===== Security Assessment Criteria =====");

        for (AssessmentCriteria c : criteria) {
            c.displayCriteria();
        }

        System.out.println();
        SecurityAssessment assessment = new SecurityAssessment();

        assessment.calculateScore(criteria);

        assessment.displayAssessment();

        System.out.println();

        // ==========================
        // التوصيات الأمنية
        // ==========================

        SecurityRecommendation recommendation =
                new SecurityRecommendation();

        ArrayList<String> recommendations =
                recommendation.generateRecommendations(criteria);

        ReportGenerator report =
                new ReportGenerator();

        report.generateReport(
                assessment,
                recommendations
        );

        // ==========================
        // تجهيز تقرير HTML
        // ==========================
    ArrayList<String> trafficResults =
                new ArrayList<>();

        trafficResults.add(
                p1.getSourceIp() + "," +
                p1.getDestinationIp() + "," +
                p1.getPort() + "," +
                p1.getProtocol() + "," +
                firewall.checkPacket(p1)
        );

        trafficResults.add(
                p2.getSourceIp() + "," +
                p2.getDestinationIp() + "," +
                p2.getPort() + "," +
                p2.getProtocol() + "," +
                firewall.checkPacket(p2)
        );

        trafficResults.add(
                p3.getSourceIp() + "," +
                p3.getDestinationIp() + "," +
                p3.getPort() + "," +
                p3.getProtocol() + "," +
                firewall.checkPacket(p3)
        );

        trafficResults.add(
                p4.getSourceIp() + "," +
                p4.getDestinationIp() + "," +
                p4.getPort() + "," +
                p4.getProtocol() + "," +
                firewall.checkPacket(p4)
        );

        trafficResults.add(
                p5.getSourceIp() + "," +
                p5.getDestinationIp() + "," +
                p5.getPort() + "," +
                p5.getProtocol() + "," +
                firewall.checkPacket(p5)
        );

        trafficResults.add(
                p6.getSourceIp() + "," +
                p6.getDestinationIp() + "," +
                p6.getPort() + "," +
                p6.getProtocol() + "," +
                firewall.checkPacket(p6)
        );

        HTMLReportGenerator html =
                new HTMLReportGenerator();

        html.generateHTML(
                assessment,
                recommendations,
                7,
                5,
                trafficResults
        );

    }
}
