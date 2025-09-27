public class App {
    public static void main(String[] args) throws Exception {
        Vehicle[][] vehicles = {
            {
                new Vehicle("Audi", "A4", 2014),      
                new Vehicle("Audi","A3",2009)      
            },
            {
                new Vehicle("BMW", "M4", 2025),
                new Vehicle("BMW", "Series 1", 2012),
                new Vehicle("Honda", "Civic", 2013)
            },
            {
                new Vehicle("Toyota", "Yaris", 1999),
                new Vehicle("Fiat", "Punto", 1994)
            }
        };

        int rowIndex = 1;
        for(Vehicle[] row : vehicles) {
            System.out.println("There are " + row.length + " cars parked on floor " + rowIndex);
            for(Vehicle car : row) {
                System.out.println(car.make + " " + car.model + " " + car.year);
            }
            rowIndex++;
        }
    };
}

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    };
}
