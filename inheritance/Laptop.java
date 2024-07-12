public class Laptop extends Computers{
    private double screenSize;
    private boolean keyboardBacklight;


    public Laptop(String brand, String type, String processor, int ram, double screenSize, boolean keyboardBacklight){
        super(processor, ram);
        this.screenSize = screenSize;
        this.keyboardBacklight = keyboardBacklight;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isKeyboardBacklight() {
        return keyboardBacklight;
    }

    public void setKeyboardBacklight(boolean keyboardBacklight) {
        this.keyboardBacklight = keyboardBacklight;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Screen size: "+screenSize);
        System.out.println("Keyboard backlight: "+keyboardBacklight);
    }

}
