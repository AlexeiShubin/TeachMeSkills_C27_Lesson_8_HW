package task1.doctor;

/*
 * Class therapist with treat method and
 * method for determining the treatment plan
 */

import task1.patient.Patient;

public class Therapist implements ITreat{


    @Override
    public void treat(Patient patient) {
        System.out.println(patient.getName()+": therapist");
    }

    public void doctor1(Patient patient){
        if(patient.getPlan()==1){
            patient.setDoctor(new Dentist());
        } else if (patient.getPlan()==2) {
            patient.setDoctor(new Therapist());
        } else if (patient.getPlan()==3) {
            patient.setDoctor(new Surgeon());
        }
        patient.getDoctor().treat(patient);
    }
}
