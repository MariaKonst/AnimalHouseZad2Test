public class Main {
    public static void main(String[] args) {
        AnimalHouse<Fish> fishHouse = new AnimalHouse<>();
        AnimalHouse<Bunny> bunnyHouse = new AnimalHouse<>();
        Fish fishy = new Fish("Ilonka");
        Bunny bunnyCute = new Bunny(3);

       fishHouse.animal = fishy;
        bunnyHouse.animal = bunnyCute;

    }


}