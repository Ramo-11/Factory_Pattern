public class OperatingSystemFactory {
    public OperatingSystem getOS(String OS) {
        if(OS.isEmpty() || OS == null) {
            System.out.println("Operating System of type [" + OS + "] is not supported");
            return null;
        } else if(OS.equalsIgnoreCase("Linux")) {
            return new LinuxOS();
        } else if(OS.equalsIgnoreCase("Windows")) {
            return new WindowsOS();
        } else if(OS.equalsIgnoreCase("Macintosh")) {
            return new MacintoshOS();
        } else {
            throw new IllegalArgumentException("Operating System of type [" + OS + "] is not supported");
        }
    }
}
