import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ==========================
        // أولاً: محاكاة الجدار الناري
        // ==========================

        // إنشاء محرك الجدار الناري
        EngineFirewall firewall = new EngineFirewall();

        // ==========================
        // إنشاء أجهزة الشبكة
        // ==========================

        Device admin = new Device(
                "Admin PC",
                "Administrator",
                "192.168.1.10"
        );

        Device student = new Device(
                "Student PC",
                "Student",
                "192.168.1.20"
        );

        Device guest = new Device(
                "Guest PC",
                "Guest",
                "192.168.1.30"
        );

        Device server = new Device(
                "Internal Server",
                "Server",
                "192.168.1.50"
        );

        Device printer = new Device(
                "Network Printer",
                "Printer",
                "192.168.1.60"
        );

        // عرض الأجهزة
        System.out.println("===== Network Devices =====");

        admin.displayInfo();
        System.out.println();

        student.displayInfo();
        System.out.println();

        guest.displayInfo();
        System.out.println();

        server.displayInfo();
        System.out.println();

        printer.displayInfo();
        System.out.println();

        // ==========================
        // إنشاء قواعد الجدار الناري
        // ==========================

        FirewallRule rule1 = new FirewallRule(
                "192.168.1.10",
                "192.168.1.50",
                80,
                "TCP",
                "Allow"
        );

        FirewallRule rule2 = new FirewallRule(
                "192.168.1.20",
                "192.168.1.50",
                80,
                "TCP",
                "Deny"
        );

        FirewallRule rule3 = new FirewallRule(
                "192.168.1.30",
                "192.168.1.50",
                22,
                "SSH",
                "Allow"
        );

        FirewallRule rule4 = new FirewallRule(
                "192.168.1.30",
                "192.168.1.50",
                23,
                "Telnet",
                "Deny"
        );

        FirewallRule rule5 = new FirewallRule(
                "192.168.1.60",
                "192.168.1.50",
                443,
                "HTTPS",
                "Allow"
        );

        // إضافة القواعد إلى الجدار الناري
        firewall.addRule(rule1);
        firewall.addRule(rule2);
        firewall.addRule(rule3);
        firewall.addRule(rule4);
        firewall.addRule(rule5);

        // عرض قواعد الجدار الناري
        firewall.displayRules();

        System.out.println();

        // ==========================
        // إنشاء حزم البيانات
        // ==========================

        Packet p1 = new Packet(
                "192.168.1.10",
                "192.168.1.50",
                80,
                "TCP",
                "HTTP",
                ""
        );

        Packet p2 = new Packet(
                "192.168.1.20",
                "192.168.1.50",
                80,
                "TCP",
                "HTTP",
                ""
        );

        Packet p3 = new Packet(
                "192.168.1.99",
                "192.168.1.50",
                80,
                "TCP",
                "HTTP",
                ""
        );

        Packet p4 = new Packet(
                "192.168.1.30",
                "192.168.1.50",
                22,
                "SSH",
                "SSH Service",
                ""
        );

        Packet p5 = new Packet(
                "192.168.1.30",
                "192.168.1.50",
                23,
                "Telnet",
                "Telnet Service",
                ""
        );

        Packet p6 = new Packet(
                "192.168.1.60",
                "192.168.1.50",
                443,
                "HTTPS",
                "Web Service",
                ""
        );
                // ==========================
        // عرض نتائج محاكاة الجدار الناري
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

        // عرض معايير التقييم
        System.out.println("===== Security Assessment Criteria =====");

        for (AssessmentCriteria c : criteria) {
            c.displayCriteria();
        }

        System.out.println();

        // حساب درجة الأمان
        SecurityAssessment assessment = new SecurityAssessment();
        assessment.calculateScore(criteria);

        // عرض نتيجة التقييم
        assessment.displayAssessment();

        System.out.println();

        // إنشاء التوصيات الأمنية
        SecurityRecommendation recommendation = new SecurityRecommendation();
        ArrayList<String> recommendations =
                recommendation.generateRecommendations(criteria);

        // إنشاء التقرير النصي
        ReportGenerator report = new ReportGenerator();
        report.generateReport(assessment, recommendations);

        // إنشاء تقرير HTML
        HTMLReportGenerator html = new HTMLReportGenerator();
        html.generateHTML(assessment, recommendations);
    }
}
