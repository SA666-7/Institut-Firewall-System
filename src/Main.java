import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // إنشاء قائمة معايير التقييم
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

        // إنشاء التوصيات تلقائياً
        SecurityRecommendation recommendation = new SecurityRecommendation();
        ArrayList<String> recommendations =
                recommendation.generateRecommendations(criteria);

        // إنشاء التقرير
        ReportGenerator report = new ReportGenerator();
        report.generateReport(assessment, recommendations);
    }
}
