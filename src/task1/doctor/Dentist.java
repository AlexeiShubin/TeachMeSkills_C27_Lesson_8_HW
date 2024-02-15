package task1.doctor;

/*
  Class dentist with treat method
 */

import task1.patient.Patient;

public class Dentist implements ITreat{
    @Override
    public void treat(Patient patient) {
        System.out.println(patient.getName()+": dentist");
    }
}
