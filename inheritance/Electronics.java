public class Electronics {
    private String brand;
    private String type;

    public Electronics() {
    }

    public Electronics(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Type: "+type);
    }

}
