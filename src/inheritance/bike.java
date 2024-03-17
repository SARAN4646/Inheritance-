package inheritance;

public class  bike extends enginetype 
{
    private String model;

    // Constructor
    public bike(String type, int horsepower, String model) 
    {
        super(type, horsepower);
        this.model = model;
    }

    // Getter method
    public String getModel() 
    {
        return model;
    } 

}
