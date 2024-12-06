package animals;

public class Blowfish extends Fish {
    private String species;

    public Blowfish() {
        super();
        this.species = "Unknown";
    }

    public Blowfish(String name, int age, double weight, boolean isSaltwater, String species) {
        super(name, age, weight, isSaltwater);
        this.species = species;
    }

    public Blowfish(String name, String species) {
        super(name);
        this.species = species;
    }

    @Override
    public void getVoice() {
        System.out.println(name + " makes a puffing sound!");
    }

    public void inflate() {
        System.out.println(name + " is inflating to scare predators!");
    }

    @Override
    public String toString() {
        return super.toString() + ", species='" + species + "'";
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
}
