public class Driver5 {

    public static void main(String[] args) throws InvalidOptionException {


        ArrayProcessor ap = new ArrayProcessor();
        int len = ap.getArrayLength(new String[] {"one", "two", "three"});
        System.out.println("Array length is " +len);


        Menu menu = new Menu();
        menu.displayMenuOption(2);
        menu.displayMenuOption(5);



    }


    //this is a completely wrong use of exceptions because it's relying on it to make the loop end, also rewriting a function that could be called with a.length

}
