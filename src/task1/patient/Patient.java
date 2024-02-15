package task1.patient;

/*
  Class patient object "patient"
  and method for determining the treatment plan
 */

import task1.doctor.ITreat;

public class Patient {

    private final String name;

    private final byte plan;

    private ITreat doctor;

    public Patient(String name, byte plan){
        this.name=name;
        this.plan=plan;
    }

    public String getName(){
        return "patient "+ name;
    }

    public Byte getPlan(){
        return plan;
    }

    public ITreat getDoctor(){
        return doctor;
    }

    public void setDoctor(ITreat doctor){
        this.doctor=doctor;
    }



}
