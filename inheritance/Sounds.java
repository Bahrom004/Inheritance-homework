public class Sounds extends Electronics{
    private int wattage;

    public Sounds(int wattage) {
        this.wattage = wattage;
    }

    public Sounds(String brand, String type, int wattage) {
        super(brand, type);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Wattage: "+wattage);
    }
}
