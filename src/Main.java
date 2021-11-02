public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        dog1.name = "azorel";
        dog1.age = 15;
        dog1.healthLevel = 5;
        dog1.hungerLevel = 6;
        dog1.spiritLevel = 10;
        dog1.favouriteFood = "pate";
        dog1.favouriteRecreationActivity = "plimbare";
        dog1.animalPrint();

        Adopter adp1 = new Adopter();
        adp1.name = "Veronica";
        adp1.availableMoney = 100;
        adp1.adopterPrint();

        AnimalFood af1 = new AnimalFood();
        af1.name = "Pate";
        af1.price = 150;
        af1.quantity = 10;
        af1.isAvailable = true;
        af1.foodPrint();

        RecreationActivity rac1 = new RecreationActivity();
        rac1.name = "Plimbare";
        rac1.printRecreationActivity();

        Veterinarian vet1 = new Veterinarian();
        vet1.name = "Gigel";
        vet1.specialization = "Caini";
        vet1.vetPrint();
    }
}
