public class Packet {

    private String sourceIp;
    private String destinationIp;
    private int port;
    private String protocol;
    private String serviceName;
    private String result;

    public Packet(String sourceIp, String destinationIp, int port,
                  String protocol, String serviceName, String result) {

        this.sourceIp = sourceIp;
        this.destinationIp = destinationIp;
        this.port = port;
        this.protocol = protocol;
        this.serviceName = serviceName;
        this.result = result;
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

    public String getServiceName() {
        return serviceName;
    }

    public String getResult() {
        return result;
    }
}
