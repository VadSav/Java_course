
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HospitalMain {
    public static void main(String[] args) {

        List<Patient> patientList = new LinkedList<>();
        //List<Patient> patientList = new ArrayList<>();



        Patient p1 = new Patient("Pac01", 1985,Speciality.DENTIST);
         Patient p2 = new Patient("Pac02", 1990,Speciality.OCULIST);
        Patient p3 = new Patient("Pac03", 1970,Speciality.TERAPIST);
        Patient p4 = new Patient("Pac04", 1998,Speciality.CADIOLOGIST);
        Patient p5 = new Patient("Pac05", 1999,Speciality.OCULIST);



        patientList.add(new Patient("Pac01", 1985,Speciality.DENTIST));
        patientList.add(new Patient("Pac02", 1990,Speciality.OCULIST));
        patientList.add(new Patient("Pac02", 1990,Speciality.OCULIST));
        patientList.add(new Patient("Pac03", 1970,Speciality.TERAPIST));

       // System.out.println(patientList);
        System.out.println("size of the list "+ patientList.size());

        for (Patient p:patientList) {
            System.out.println(p);
        }

        System.out.println("indexOf "+ patientList.indexOf(new Patient("Pac02", 1990,Speciality.OCULIST)));
        System.out.println(Patient.counter);
        patientList.remove(new Patient("Pac02", 1990,Speciality.OCULIST));



        System.out.println("size of the list "+ patientList.size());

        for (Patient p:patientList) {
            System.out.println(p);
        }


        System.out.println(" ------------- old output");

        PatientQueue patientQueue = new PatientQueue();
        patientQueue.add(p1);
        patientQueue.add(p2);
        patientQueue.add(p3);
        patientQueue.add(p4);
        patientQueue.add(p5);

        Reception reception = new Reception(100);
        reception.handleQueue(patientQueue);
        reception.print();

        PatientCreator pc = new CreatePatientFromRandom();
        //pc = new NewPatientFromScanner();

        Patient patient=pc.createPatient();
        System.out.println(patient);
        Patient patient2 = pc.createPatient();
        System.out.println(patient2);
/*
        patientQueue.print();
        System.out.println("--------------------");

        Patient patient=patientQueue.get();
        while (patient!=null){

            Appointment appointment = new Appointment(doctors.getDoctor(patient.getSpeciality()),patient);
            System.out.println(appointment);
            patient = patientQueue.get();
        }

*/



    }
}
