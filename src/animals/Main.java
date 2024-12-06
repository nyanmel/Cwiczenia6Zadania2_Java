package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Dog("Buddy", 5, 12.0, true, "Golden Retriever");
        animals[1] = new Pigeon("Sky", 2, 0.5, "White", "Rock Pigeon");
        animals[2] = new Blowfish("Bubbles", 1, 0.3, true, "Pacific Blowfish");
        animals[3] = new Mammal("Elephant", 20, 5000.0, false);
        animals[4] = new Bird("Parrot", 3, 1.5, "Green");
        animals[5] = new Fish("Goldfish", 1, 0.2, false);

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.getVoice();
            animal.eat();
            if (animal instanceof Mammal mammal) {
                mammal.run();
            }
            if (animal instanceof Bird bird) {
                bird.fly();
            }
            if (animal instanceof Fish fish) {
                fish.swim();
            }
            if (animal instanceof Dog dog) {
                dog.fetch();
            }
            if (animal instanceof Pigeon pigeon) {
                pigeon.deliverMessage();
            }
            if (animal instanceof Blowfish blowfish) {
                blowfish.inflate();
            }
        }
    }
}
