public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory factory = new OperatingSystemFactory();
        OperatingSystem os = factory.getOS("Windows");
        os.showDetails();
    }
}
