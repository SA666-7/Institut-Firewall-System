public class FirewallRule {

    private String sourceIp;
    private String destinationIp;
    private int port;
    private String protocol;
    private String action;

    public FirewallRule(String sourceIp, String destinationIp, int port, String protocol, String action) {
        this.sourceIp = sourceIp;
        this.destinationIp = destinationIp;
        this.port = port;
        this.protocol = protocol;
        this.action = action;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public String getDestinationIp() {
        return destinationIp;
    }

    public int getPort() {
        return port;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getAction() {
        return action;
    }

    public void displayRule() {
        System.out.println("Firewall Rule:");
        System.out.println("Source IP: " + sourceIp);
        System.out.println("Destination IP: " + destinationIp);
        System.out.println("Port: " + port);
        System.out.println("Protocol: " + protocol);
        System.out.println("Action: " + action);
    }
}
