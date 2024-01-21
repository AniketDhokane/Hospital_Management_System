package models;

import database.DoctorDatabase;
import database.PatientDatabase;
import database.RoomDatabase;

import java.util.List;

public class Hospital {

    private String name;

    private String address;

    private double phoneNo;

    private String emailID;

    private PatientDatabase patientDatabase;
    private DoctorDatabase doctorDatabase;
    private RoomDatabase roomDatabase;

    public Hospital(String name, String address, double phoneNo, String emailID) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.emailID = emailID;
        this.patientDatabase = new PatientDatabase();
        this.doctorDatabase = new DoctorDatabase();
        this.roomDatabase = new RoomDatabase();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public double getPhoneNo(){
        return phoneNo;
    }
    public void setPhoneNo(double phoneNo){
        this.phoneNo=phoneNo;
    }
    public String getEmailID(){
        return emailID;
    }

    public void setEmailID(String emailID){
        this.emailID=emailID;
    }

    public void admitPatient(String name, int age, Long phoneNo, String emailID, String gender, String disease ){
        //Patient will provide details
        //Now it is work of Hospital to assign doctor to patient
        //Hospital will assign rooms to patient
        // When we will get all the details we will create patient object
        // and we will be using our database to save that patient object

        //1. Generate ID for the patient->
        int totalPatientCount= patientDatabase.getTotalPatientCount()+1;
        String pId="PID"+totalPatientCount;

        //2. Get the doctor who is handling minimum number of patient
        Doctor doctor = doctorDatabase.getMinPatientDoctor();

        //3. get the room which is not occupied
        Room room =roomDatabase.getUnoccupiedRoom();
        room.setOccupied(true);

        Patient p= new Patient(pId,name,age,phoneNo,emailID,gender,disease,doctor,room,true);
        doctor.patientList.add(p);
        System.out.println("Patient got admitted successfully -->" + p);
    }

    public void createRoom(){
        String roomId="ROOMID"+(roomDatabase.getTotalRoom()+1);
        Room room=new Room(roomId,false,null,null);
        roomDatabase.addRoomToDB(room);
        System.out.println("Room added successfully -> "+ room);
    }
    public void appointDoctor(String docDegree, String name, Long phoneNo, String speciality, int salary, String timeSlot){
        String docId= "DOCID"+(doctorDatabase.getTotalDoctors()+1);
        Doctor doc = new Doctor(docId,docDegree,name,phoneNo,speciality,salary,timeSlot);
        doctorDatabase.addDoctorToDB(doc);
        System.out.println("Doctor created successfully ->" + doc);
    }
}
