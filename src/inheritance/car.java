package inheritance;

public class car extends enginetype
{
    private String brand;

    public car(String type, int horsepower, String brand) 
    {
        super(type, horsepower);
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
}
