public class SecurityRecommendation {

    private String recommendation;
    private String priority;

    public SecurityRecommendation(String recommendation, String priority) {
        this.recommendation = recommendation;
        this.priority = priority;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public String getPriority() {
        return priority;
    }

    public void displayRecommendation() {
        System.out.println("Security Recommendation:");
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Priority: " + priority);
    }
}
