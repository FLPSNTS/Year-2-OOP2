
public interface Delivery {

    String getTutor() throws NoTutorException;
    void setTutor(String tutor);
    String getRoom() throws NoRoomException;
    void setRoom (String room);
}
