import models.Doctor;
import models.Hospital;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        Hospital h=  new Hospital("vardhman hospital","dahihanda",77777,"abc@gmail.com");
        h.appointDoctor("MMBS","Aniket", 88888L,"Psychologist",1200000,"1:00AM");
        h.admitPatient("sonu",35,12452L,"aabcsd@gmail.com","male","liver");
        h.createRoom();

   }
}