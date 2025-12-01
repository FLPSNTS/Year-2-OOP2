//Subject is abstract class
public abstract class Subject implements Delivery {

    private final String name;
    private final String description;
    private String tutor;
    private String room;

    @Override
    public String getTutor() {
        return this.tutor;
    }

    @Override
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String getRoom() {
        return this.room;
    }

    @Override
    public void setRoom(String room) {
        this.room = room;
    }

    abstract int getCredits(); //The getCredit() method is declared as abstract within the Subject class.

    public String getName() {
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }


    //The ‘name’ and ‘description’ attribute values should be setup by the constructors (since no
    //set methods exist)
    public Subject(String name, String description){
        this.name = name;
        this.description = description;
    }
}
