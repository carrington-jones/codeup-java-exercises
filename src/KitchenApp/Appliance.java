package KitchenApp;

public abstract class Appliance {
    protected String type;
    protected String brandName;

    public Appliance(String type, String brandName) {
        this.type = type;
        this.brandName = brandName;
    }
    //Abstract methods are defined using the "abstract keyword.
    //and create a blueprint for a method to be implemented in the subclass.
    //Abstract methods provide the return type, name of the method, and number of parameters and parameter types.
    public abstract void setType(String type);

    public abstract void setbrandName(String brandName);

    public void sayHello(){
        System.out.println("Hello!");
    }

}
