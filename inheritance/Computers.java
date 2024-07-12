public class Computers extends Electronics{
    private String processor;
    private int ram;


    public Computers(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public Computers(String brand, String type, String processor, int ram){
        super(brand, type);
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor(){
        return processor;
    }
    public void setProcessor(){
        this.processor = processor;
    }
    public int getRam(){
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Processor: "+processor);
        System.out.println("RAM: "+ram);
    }
}
