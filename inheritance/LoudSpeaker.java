public class LoudSpeaker extends Sounds{
    private int usersAmount;


    public LoudSpeaker(String brand, String type, int wattage, int usersAmount) {
        super(brand, type, wattage);
        this.usersAmount = usersAmount;
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    public void setUsersAmount(int usersAmount) {
        this.usersAmount = usersAmount;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Users number: "+usersAmount);
    }
}
