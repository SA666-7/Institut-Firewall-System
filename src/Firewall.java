import java.util.ArrayList;

public class Firewall {

    private ArrayList<FirewallRule> rules;

    public Firewall() {
        rules = new ArrayList<>();
    }

    // Add firewall rule
    public void addRule(FirewallRule rule) {
        rules.add(rule);
    }

    // Check traffic permission
    public boolean checkConnection(String source, String destination) {

        for (FirewallRule rule : rules) {

            if (rule.getSourceIp().equals(source) &&
                rule.getDestinationIp().equals(destination)) {

                return rule.getAction().equals("Allow");
            }
        }

        return false; // Block if no rule exists
    }
}