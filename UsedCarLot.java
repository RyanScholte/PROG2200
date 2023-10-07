import java.util.ArrayList;

class Car {
    private String model;
    private int year;
    private String color;
    private double price;

    public Car(String model, int year, String color, double price) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year + ", Color: " + color + ", Price: $" + price;
    }
}

public class UsedCarLot {
    public static void main(String[] args) {
        // Create an ArrayList to store car objects
        ArrayList<Car> cars = new ArrayList<>();

        // Add cars to the list
        cars.add(new Car("Toyota Camry", 2020, "Silver", 25000.0));
        cars.add(new Car("Honda Civic", 2019, "Blue", 22000.0));
        cars.add(new Car("Ford Mustang", 2021, "Red", 35000.0));
        cars.add(new Car("Chevrolet Malibu", 2018, "Black", 18000.0));
        cars.add(new Car("Nissan Altima", 2022, "White", 27000.0));

        // Print the information of each car
        System.out.println("Cars on the Used Car Lot:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}