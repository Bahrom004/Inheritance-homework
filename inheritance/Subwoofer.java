public class Subwoofer extends Sounds{
    private boolean wireless;

    public Subwoofer(String brand, String type, int wattage, boolean wireless) {
        super(brand, type, wattage);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Wireless: "+wireless);
    }
}
