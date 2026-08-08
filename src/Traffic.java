public class Traffic {

    private String source;
    private String destination;
    private String result;

    public Traffic(String source, String destination, String result) {
        this.source = source;
        this.destination = destination;
        this.result = result;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getResult() {
        return result;
    }

    public void displayTraffic() {
        System.out.println("Traffic:");
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Result: " + result);
    }
}
