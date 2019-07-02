
public class Doctor extends Person {
    private  Speciality speciality;

    public Doctor(String name, int yearOfBirth, Speciality speciality) {
        super(name, yearOfBirth);
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "Doctor " + this.getName() + " " + speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        if (!super.equals(o)) return false;

        Doctor doctor = (Doctor) o;

        return getSpeciality() == doctor.getSpeciality();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getSpeciality() != null ? getSpeciality().hashCode() : 0);
        return result;
    }
}
