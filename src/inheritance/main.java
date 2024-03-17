package inheritance;

public class  main 
{
    public static void main(String[] args) 
    {
        // Creating objects of Car and Bike classes
        car myCar = new car("diesel", 300, "Toyota");
        bike myBike = new bike("petrol", 150, "Yamaha");
        System.out.println("My car:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Engine Type: " + myCar.getType());
        System.out.println("Horsepower: " + myCar.getHorsepower());

        System.out.println("\nMy bike:");
        System.out.println("Model: " + myBike.getModel());
        System.out.println("Engine Type: " + myBike.getType());
        System.out.println("Horsepower: " + myBike.getHorsepower());
    } 

}
