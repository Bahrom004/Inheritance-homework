public class Lor extends Doctor{
    private  String treatmentArea;

    public Lor(int age, String workPlace, String name, String specialty, String treatmentArea) {
        super(age, workPlace, name, specialty);
        this.treatmentArea = treatmentArea;
    }

    public String getTreatmentArea() {
        return treatmentArea;
    }

    public void setTreatmentArea(String treatmentArea) {
        this.treatmentArea = treatmentArea;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Treatment Area: " + treatmentArea);
    }
}
