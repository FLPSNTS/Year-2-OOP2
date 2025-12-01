public class Subject implements Delivery {

    private String name;
    private String description;
    private String tutor;
    private String room;
    private int credits;

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

    public int getCredits() {
        return this.credits;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public Subject(String name, String description){
        this.name = name;
        this.description = description;
    }
}
