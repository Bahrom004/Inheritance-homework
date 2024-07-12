public class Doctor {
    private int age;
    private String workPlace;
    private String name;
    private String specialty;

    public Doctor() {
    }

    public Doctor(int age, String workPlace, String name, String specialty) {
        this.age = age;
        this.workPlace = workPlace;
        this.name = name;
        this.specialty = specialty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        System.out.println("Work Place: " + workPlace);
    }
}
