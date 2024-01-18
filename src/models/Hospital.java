package models;

import java.awt.*;

public class Hospital {

    private String name;

    private String address;

    private double phoneNo;

    private String emailID;



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
}
