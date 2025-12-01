public abstract class Social extends Subject {

    public Social(String name, String description) {
        super(name, description);
    }

    //All Science-based subjects have a credit amount of 100
    public int getCredits() {
        return 50;
    }

}
