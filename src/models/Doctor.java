package models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    String docId;
    String docDegree;
    String name;
    Long phoneNo;
    String speciality;
    int salary;
    String timeSlot;

  public List<Patient> patientList;

    @Override
    public String toString() {
        return "Doctor{" +
                "docId='" + docId + '\'' +
                ", docDegree='" + docDegree + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", speciality='" + speciality + '\'' +
                ", salary=" + salary +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    public Doctor(String docId, String docDegree, String name, Long phoneNo, String speciality, int salary, String timeSlot) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.name = name;
        this.phoneNo = phoneNo;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientList= new ArrayList<>();
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocDegree() {
        return docDegree;
    }

    public void setDocDegree(String docDegree) {
        this.docDegree = docDegree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}

