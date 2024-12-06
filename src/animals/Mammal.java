package animals;

public class Mammal extends Animal {
    private boolean hasFur;

    public Mammal() {
        super();
        this.hasFur = true;
    }

    public Mammal(String name, int age, double weight, boolean hasFur) {
        super(name, age, weight);
        this.hasFur = hasFur;
    }

    public Mammal(String name) {
        super(name);
        this.hasFur = true;
    }

    @Override
    public void getVoice() {
        System.out.println(name + " makes a mammal sound.");
    }

    public void run() {
        System.out.println(name + " is running!");
    }

    @Override
    public String toString() {
        return super.toString() + ", hasFur=" + hasFur;
    }

    public boolean isHasFur() { return hasFur; }
    public void setHasFur(boolean hasFur) { this.hasFur = hasFur; }
}
