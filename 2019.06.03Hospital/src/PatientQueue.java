
import java.util.ArrayList;
import java.util.List;

public class PatientQueue {
    private List<Patient> patients = new ArrayList<>();

    public void add(Patient patient){
        patients.add(patient);
    }


    public Patient get(){
        if(patients.size()>0){
            Patient patient = patients.get(0);
            patients.remove(patient);
            return patient;
        } else {
            return null;
        }
    }

    public Patient get(Speciality speciality){
        return  null;
    }

    public void print(){
            System.out.println("Size of the Queue is " + patients.size());
            for (Patient patient:patients){
                System.out.println(patient);
            }

    }



}
