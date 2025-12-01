public class NoRoomException extends SubjectException {
    public NoRoomException(String message) {
        super("Please choose a room:");
    }
}

