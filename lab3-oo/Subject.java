public class Subject implements Delivery {

    private String name;
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
}