import java.util.ArrayList;
import java.util.Iterator;
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
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length() > 15){
                iterator.remove();
            }
        }

    }

    //other solution
    //void removeLongNames() {
    //    names.removeIf(name -> name.length() > 15);
    //}



}

