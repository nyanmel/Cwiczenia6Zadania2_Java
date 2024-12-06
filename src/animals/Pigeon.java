package animals;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name);
        this.species = species;
    }

    @Override
    public void getVoice() {
        System.out.println(name + " coos!");
    }

    public void deliverMessage() {
        System.out.println(name + " is delivering a message!");
    }

    @Override
    public String toString() {
        return super.toString() + ", species='" + species + "'";
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
}
