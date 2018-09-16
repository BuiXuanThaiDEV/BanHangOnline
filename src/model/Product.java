package model;

public class Product {
    private int Type, Price,Number;
    private String Name;
    public Product( String Name , int Type , int Price , int Number){
            this.Name = Name;
            this.Type = Type;
            this.Price = Price;
            this.Number = Number;
    }
    public String getName(){
        return this.Name;
    }
    public int getType(){
        return this.Type;
    }
    public int getPrice(){
        return this.Price;
    }
    public int getNumber(){
        return this.Number;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setType(int Type){
        this.Type = Type;
    }
    public void setPrice(int Price){
        this.Price = Price;
    }
    public void setNumber(int Number){
        this.Number = Number;
    }

}
