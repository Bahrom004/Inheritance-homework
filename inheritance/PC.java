public class PC extends Computers{
    private String videoCard;

    public PC(String brand, String type, String processor, int ram, String videoCard){
        super(processor, ram);
        this.videoCard = videoCard;
    }
    public String getVideoCard(){
        return videoCard;
    }
    public void setVideoCard(){
        this.videoCard = videoCard;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Videocard of PC: "+videoCard);
    }
}
