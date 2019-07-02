
import java.util.Random;

public class CreatePatientFromRandom implements PatientCreator {
    Random rnd = new Random(System.currentTimeMillis());
    private Patient[] patients={
        new Patient("Pac01", 1985,Speciality.DENTIST),
        new Patient("Pac02", 1990,Speciality.OCULIST),
        new Patient("Pac03", 1970,Speciality.TERAPIST),
        new Patient("Pac04", 1998,Speciality.CADIOLOGIST),
        new Patient("Pac05", 1999,Speciality.OCULIST),
            new Patient("Pac06", 1986,Speciality.DENTIST),
            new Patient("Pac07", 1997,Speciality.OCULIST),
            new Patient("Pac08", 1979,Speciality.TERAPIST),
            new Patient("Pac09", 1980,Speciality.CADIOLOGIST),
            new Patient("Pac10", 1999,Speciality.OCULIST)

    };

    @Override
    public Patient createPatient() {
        int index = rnd.nextInt(patients.length);
        return  patients[index];

    }
}
