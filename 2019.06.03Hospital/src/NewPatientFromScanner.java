
import java.util.Scanner;

public class NewPatientFromScanner implements PatientCreator {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Patient createPatient() {
        System.out.println("Name:");
        String name = scanner.next();
        System.out.println("Year:");
        int year = scanner.nextInt();
        System.out.println("Speciality:");
        String speciality = scanner.next();
        speciality = speciality.toUpperCase();
        Speciality sp;// = Speciality.valueOf(speciality);

        switch (speciality){
            case "DENTIST": sp = Speciality.DENTIST; break;
            case "TERAPIST": sp = Speciality.TERAPIST; break;
            case "OCULIST": sp = Speciality.OCULIST; break;
            case "CADIOLOGIST": sp = Speciality.CADIOLOGIST; break;
            default: sp = Speciality.TERAPIST;
        }

        return new Patient(name,year,sp);
    }
}
