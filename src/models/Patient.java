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

    boolean isAdmit;
    public Patient(String pid, String name, int age, Long mobNo, String email, String gender, String disease, Doctor doctor, Room room,boolean isAdmit) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor=doctor;
        this.room=room;
        this.isAdmit=isAdmit;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mobNo=" + mobNo +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", doctor=" + doctor +
                ", room=" + room +
                ", isAdmit=" + isAdmit +
                '}';
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
