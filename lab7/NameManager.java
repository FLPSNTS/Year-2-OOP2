import java.util.ArrayList;
import java.util.List;

public class NameManager {
    List<String> names = new ArrayList<String>();


    void addName(String name){
        names.add(name);
    }

    void printNames(){
        for (String name : names){
            System.out.println(name);
        }
    }

    void removeLongNames(){

        for (name : names){
            if (name.length() > 15){
                names.remove(name);
            }
        }
    }


}

