package model;

public class TypeProduct {
    private String Name;
    private int TypeID;
    public TypeProduct(int TypeID , String Name){
        this.TypeID = TypeID;
        this.Name = Name;
    }
    public int getTypeID(){
        return TypeID;
    }
    public String getName(){
        return Name;
    }
    public void setTypeID( int TypeID){
        this.TypeID = TypeID;
    }
    public  void  setName(String Name){
        this.Name = Name;
    }
}
