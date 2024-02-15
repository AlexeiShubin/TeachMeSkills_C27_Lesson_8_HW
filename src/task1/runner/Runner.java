package task1.runner;

import task1.doctor.Therapist;
import task1.patient.Patient;

public class Runner {
    public static void main(String[] args){
        Patient patientNumber1=new Patient("Arina", (byte) 2);
        Patient patientNumber2=new Patient("Artem", (byte) 1);

        Therapist therapist=new Therapist();

        therapist.doctor1(patientNumber1);
        therapist.doctor1(patientNumber2);
    }
}
