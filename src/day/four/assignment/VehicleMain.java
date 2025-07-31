package day.four.assignment;

public class VehicleMain {
    public static void main(String[] args) {
        Audi audi = new Audi("A4", 18.5, 4000000, 150000, 3, 5, "Petrol");
        Ford ford = new Ford("Mustang", 12.0, 5500000, 180000, 5, 4, "Diesel");

        Bajaj bajaj = new Bajaj("Pulsar", 45.0, 110000, 1, 5, "Air", "Alloys", 15.0);
        TVS tvs = new TVS("Apache", 48.0, 105000, 1, 5, "Oil", "Spokes", 12.0);

        audi.display();
        ford.display();
        bajaj.display();
        tvs.display();
    }
}
