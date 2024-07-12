public class Xirurg extends Doctor{

    private String yonalishi;

    public Xirurg(int age, String workPlace, String name, String specialty, String yonalishi) {
        super(age, workPlace, name, specialty);
        this.yonalishi = yonalishi;
    }

    public String getYonalishi() {
        return yonalishi;
    }

    public void setYonalishi(String yonalishi) {
        this.yonalishi = yonalishi;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Opertsiya yo'nalishi: " + yonalishi);
    }
}
