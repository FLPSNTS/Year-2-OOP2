public class Art extends Subject {

    public Art(){
        super("Art", "Art subjects");
    }

    public Art(String room, String tutor){
        super("Art", "Study drawing, painting, and creative design.", tutor, room);
    }

    @Override
    int getCredits() {
        return 30; //value not specified on notes?
    }
}
