package staticExamples;

public class ComputerClient {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Apple",16.2, true);
        Computer computer2 = new Computer("Samsung",14.1, true);

        // use class name to access static fields, static methods are class depended thing
        Computer.setScreenSize(16);
        System.out.println(Computer.getScreenSize());

    }
}
