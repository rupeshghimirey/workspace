package staticExamples;

public class Computer {

    private static int screenSize;
    private String brand;
    private double memory;
    private boolean isLaptop;

    public Computer(String brand, double memory, boolean isLaptop) {
        setBrand(brand);
        setMemory(memory);
        setLaptop(isLaptop);
    }

    public static int getScreenSize() {
        return screenSize;
    }

    public static void setScreenSize(int screenSize) {
        Computer.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
}
