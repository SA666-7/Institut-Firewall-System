public class SecurityRecommendation {

    private String recommendation;
    private String priority;

    public SecurityRecommendation(String recommendation, String priority) {

        this.recommendation = recommendation;
        this.priority = priority;

    }

    public void displayRecommendation() {

        System.out.println("- " + recommendation
                + " (Priority : " + priority + ")");

    }

}
