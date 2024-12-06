package animals;

public class Fish extends Animal {
    private boolean isSaltwater;

    public Fish() {
        super();
        this.isSaltwater = false;
    }

    public Fish(String name, int age, double weight, boolean isSaltwater) {
        super(name, age, weight);
        this.isSaltwater = isSaltwater;
    }

    public Fish(String name) {
        super(name);
        this.isSaltwater = false;
    }

    @Override
    public void getVoice() {
        System.out.println(name + " makes bubbling sounds!");
    }

    public void swim() {
        System.out.println(name + " is swimming!");
    }

    @Override
    public String toString() {
        return super.toString() + ", isSaltwater=" + isSaltwater;
    }

    public boolean isSaltwater() { return isSaltwater; }
    public void setSaltwater(boolean saltwater) { isSaltwater = saltwater; }
}
