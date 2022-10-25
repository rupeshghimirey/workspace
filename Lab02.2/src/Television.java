import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Television {

    //instance variables
    private String brand = "LG";
    private int volume = 10;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    private boolean isMuted;
    private int previousVolume;
    private DisplayType display = DisplayType.LED;
    public static final String[] VALID_BRANDS =
            { "SAMSUNG", "LG", "SONY", "TOSHIBA" };




//constructors

    public Television(){
    }


    public Television(String brand, int volume) {
        setBrand(brand.toUpperCase());
        setVolume(volume);
        this.instanceCount++;
    }
    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume);
        setDisplay(display);
        this.instanceCount++;
    }

    // Business Logic
    public void turnOn() {
        System.out.println("The " + brand + " TV is turning on!" + "Current Volume is  " + volume + "!");
    }
    public void turnOff() {
        System.out.println("Turning Off ");
    }

    public void toggleMute(){

        if(isMuted) {
            setVolume(getPreviousVolume());
            setMuted(false);
            System.out.println("Volume set to previous value: " + getVolume());

        } else {
            setPreviousVolume(getVolume());
            setVolume(MIN_VOLUME);
            setMuted(true);
            System.out.println("The volume is muted now! Current Volume is: " + getVolume());
        }

    }

    // accessors
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        List <String> validBrandList = new ArrayList<>(Arrays.asList(VALID_BRANDS));

        if(validBrandList.contains(brand)) {
            this.brand = brand;
        }else {
            System.out.printf("%s is invalid brand type! Please select in between Sony, Toshiba, Samsung and LG \n" , brand);
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME ) {
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.printf("Invalid volume %s! Volume must be in between %s - %s! \n",volume, MIN_VOLUME, MAX_VOLUME);
        }

    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void setInstanceCount(int instanceCount) {
        Television.instanceCount = instanceCount;
    }
    public int getPreviousVolume() {
        return previousVolume;
    }

    public void setPreviousVolume(int previousVolume) {
        this.previousVolume = previousVolume;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }
    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }


    public static DisplayType displayTypeConversion(String displayInString) {
        if(displayInString.equalsIgnoreCase("LED")) {
            return DisplayType.LED;
        }
        else if(displayInString.equalsIgnoreCase("OLED")) {
            return DisplayType.OLED;
        }
        else if(displayInString.equalsIgnoreCase("PLASMA")) {
            return DisplayType.PLASMA;
        }
        else if(displayInString.equalsIgnoreCase("LCD")) {
            return DisplayType.LCD;
        }
        else if(displayInString.equalsIgnoreCase("CRT")) {
            return DisplayType.CRT;
        }
        return null;

    }

    // to String
    @Override
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television brand: " + brand + ", " + "volume = " + volumeString + " Display: " + getDisplay();
    }
}
