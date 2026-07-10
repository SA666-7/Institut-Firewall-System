public class FirewallRule {

    private String sourceDevice;
    private String destinationDevice;
    private String action;
    private String protocol;

    public FirewallRule(String sourceDevice, String destinationDevice, String action, String protocol) {
        this.sourceDevice = sourceDevice;
        this.destinationDevice = destinationDevice;
        this.action = action;
        this.protocol = protocol;
    }

    public String getSourceDevice() {
        return sourceDevice;
    }

    public String getDestinationDevice() {
        return destinationDevice;
    }

    public String getAction() {
        return action;
    }

    public String getProtocol() {
        return protocol;
    }

    public void displayRule() {
        System.out.println("Firewall Rule:");
        System.out.println("From: " + sourceDevice);
        System.out.println("To: " + destinationDevice);
        System.out.println("Action: " + action);
        System.out.println("Protocol: " + protocol);
    }
}
