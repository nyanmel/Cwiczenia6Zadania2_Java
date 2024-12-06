package animals;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name) {
        super(name);
        this.featherColor = "Unknown";
    }

    @Override
    public void getVoice() {
        System.out.println(name + " chirps!");
    }

    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public String toString() {
        return super.toString() + ", featherColor='" + featherColor + "'";
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }
}
