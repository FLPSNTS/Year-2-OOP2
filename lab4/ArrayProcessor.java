/**
 *
 */
public class ArrayProcessor {

    int getArrayLength (Object [] a) {
        int count = 0;
        try {

            while (true) {
                Object t = a[count];
                count++;
            }
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array end reached");
        }

        return count;

        }


}


