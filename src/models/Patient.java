package models;

public class Patient {
    String pid;
    String name;
    int age;
    Long mobNo;
    String email;
    String gender;
    String disease;

    Doctor doctor;

    Room room;

    public Patient(String pid, String name, int age, Long mobNo, String email, String gender, String disease, Doctor doctor, Room room) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor=doctor;
        this.room=room;
    }


}
