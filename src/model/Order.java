package model;

import java.sql.Timestamp;

public class Order {
    private int ID,IDUser,IDProduct, Status;
    private Timestamp Time;
    private String Address ;
    public Order(int ID , int IDUser , int IDProduct , int Status, String Address , Timestamp Time){
        this.ID = ID;
        this.IDUser = IDUser;
        this.IDProduct = IDProduct;
        this.Status =Status;
        this.Time = Time;
        this.Address = Address;
    }
    public int getID(){
        return  this.ID;
    }
    public int getIDProduct(){
        return  this.IDProduct;
    }
    public int getIDUser(){
        return  this.IDUser;
    }
    public int getStatus(){
        return  this.Status;
    }
    public String getAddress(){
        return  this.Address;
    }
    public Timestamp getTime(){
        return this.Time;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setIDUser(int IDUser){
        this.IDUser = IDUser;
    }
    public void setIDProduct(int IDProduct){
        this.IDProduct = IDProduct;
    }
    public void setStatus(int Status){
        this.Status = Status;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public void setID(Timestamp Time){
        this.Time = Time;
    }


}
