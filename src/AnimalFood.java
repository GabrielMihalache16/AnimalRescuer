public class AnimalFood {
    String name;
    double price;
    int quantity;
    boolean isAvailable;

    public void foodPrint() {
        System.out.println("Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity + "\nAvailability: " + isAvailable);
    }
}
