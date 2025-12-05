import java.util.HashSet;
import java.util.Set;

public class EmailStore {

    Set<String> emailAddresses = new HashSet<String>();


     boolean addEmail (String email){
        return emailAddresses.add(email);
    }

    boolean returnEmail (String email){
         return emailAddresses.contains(email);

    }

    void displayEmails() {
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }
}
