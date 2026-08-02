import java.util.*;
import java.io.*;

public class Main {
    private static final int TOTAL_VEHICLES = 600;

    private ArrayList<Car> cars = null;
    private ArrayList<Bike> bikes = null;
    private HashMap<Integer, Integer> rentedCars = null;
    private HashMap<Integer, Integer> rentedBikes = null;
    
    public Main() {
        createVehicles();

        System.out.println("                                                    Vehicle Rental Management System");
        System.out.println("                                                                Welcome!\n\n");
        System.out.println("Rules: 1) Every currency is in INR");
        System.out.println("       2) You will be given choices when asked something, and you will only answer with the options number with no character involved.\n");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            reader.close();
        } catch (IOException e) {
            System.err.print("Failed to take input!\nAdditional Info :- ");
            e.printStackTrace();
        }
    }

    public void createVehicles() {
        cars = new ArrayList<Car>(TOTAL_VEHICLES / 2);
        bikes = new ArrayList<Bike>(TOTAL_VEHICLES / 2);
        rentedCars = new HashMap<Integer, Integer>(TOTAL_VEHICLES / 2);
        rentedBikes = new HashMap<Integer, Integer>(TOTAL_VEHICLES / 2);
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
