package animals;

public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, boolean hasFur, String breed) {
        super(name, age, weight, hasFur);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void getVoice() {
        System.out.println(name + " barks!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    @Override
    public String toString() {
        return super.toString() + ", breed='" + breed + "'";
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
}
