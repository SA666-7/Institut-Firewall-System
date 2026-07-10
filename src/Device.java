public class Device {

    private String name;
    private String type;
    private String ipAddress;

    // Constructor
    public Device(String name, String type, String ipAddress) {
        this.name = name;
        this.type = type;
        this.ipAddress = ipAddress;
    }

    // Get device name
    public String getName() {
        return name;
    }

    // Get device type
    public String getType() {
        return type;
    }

    // Get IP address
    public String getIpAddress() {
        return ipAddress;
    }

    // Display device information
    public void displayInfo() {
        System.out.println("Device Name: " + name);
        System.out.println("Device Type: " + type);
        System.out.println("IP Address: " + ipAddress);
    }
}
