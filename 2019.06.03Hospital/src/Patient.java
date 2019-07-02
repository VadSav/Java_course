
import java.util.Objects;

public class Patient extends Person {
    private Speciality speciality;
    public static int counter = 0;

    public Patient(String name, int yearOfBirth, Speciality speciality) {
        super(name, yearOfBirth);
        this.speciality = speciality;
        counter ++;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Patient " + super.toString() + "go to " + speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;

        Patient patient = (Patient) o;


        return (speciality == patient.speciality)&&(super.equals(o))   ;

    }

    @Override
    public int hashCode() {
        return speciality != null ? speciality.hashCode() : 0;
    }
}
