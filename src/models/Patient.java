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

    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Long getMobNo() {
        return mobNo;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }
}
