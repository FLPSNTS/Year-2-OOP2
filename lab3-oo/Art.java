public class Art extends Subject {

    public Art(){
        super("Art", "Art subjects");
    }

    @Override
    int getCredits() {
        return 30; //value not specified on notes?
    }
}
