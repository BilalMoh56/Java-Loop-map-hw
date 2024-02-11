import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {
    public static void main(String[] args) {
       
        HashMap<String, String> vehicles = new HashMap<>();
        vehicles.put("Civic", "Honda");
        vehicles.put("Accord", "Honda");
        vehicles.put("Camry", "Toyota");
        vehicles.put("Corolla", "Toyota");
        vehicles.put("Mustang", "Ford");

       
        Scanner Scanner = new Scanner(System.in);
        System.out.print("What car model are you looking for? ");
        String model = Scanner.nextLine();

      
        if (vehicles.containsKey(model)) {
            String make = vehicles.get(model);
            System.out.println(" you're looking for a " + model + "? Our " + make + "  is right over here...");
        } else {
            System.out.println("Sorry, we don't have the  model in stock.");
        }
    }
}
