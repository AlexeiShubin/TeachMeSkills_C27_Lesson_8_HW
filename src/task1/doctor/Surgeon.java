package task1.doctor;

/*
  Class surgeon with treat method
 */

import task1.patient.Patient;

public class Surgeon implements ITreat{
    @Override
    public void treat(Patient patient) {
        System.out.println(patient.getName()+": surgeon");
    }
}
