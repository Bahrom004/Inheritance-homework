
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setAge(35);
        doctor.setName("Bahrom");
        doctor.setWorkPlace("Hospital");
        doctor.setSpecialty("Lor");
        doctor.printInfo();

        System.out.println();
        System.out.println("Information about Lor:");
        Lor lor = new Lor(25, "Hospital", "Someone", "Lor", "Nose treatment");
        lor.printInfo();


        PC pc = new PC("Asus","Tuf gaming","RYZEN", 8, "RTX 3050");
        Laptop laptop = new Laptop("ASUS", "SCAR", "Intel",32, 18.5, true);
        Subwoofer subwoofer = new Subwoofer("JBL", "mini", 50, true);
        LoudSpeaker loudSpeaker = new LoudSpeaker("Best", "mini", 50, 3);

        System.out.println("PC Information:");
        pc.printInfo();

        System.out.println("\nLaptop Information:");
        laptop.printInfo();

        System.out.println("\nSubwoofer Information:");
        subwoofer.printInfo();

        System.out.println("\nLoudspeaker Information:");
        loudSpeaker.printInfo();


    }
}