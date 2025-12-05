public class Driver9 {

    public static void main(String[] args){

        Person p1 = new Person();
        p1.setAge(21);
        p1.setHeight(170);
        p1.setIsMale(false);

        Person p2 = new Person();
        p2.setAge(25);
        p2.setHeight(181);
        p2.setIsMale(true);

        Person p3 = new Person();
        p3.setAge(57);
        p3.setHeight(155);
        p3.setIsMale(false);

        Person p4 = new Person();
        p4.setAge(45);
        p4.setHeight(177);
        p4.setIsMale(true);

        Person p5 = new Person();
        p5.setAge(33);
        p5.setHeight(166);
        p5.setIsMale(false);


        Census census = new Census();
        census.addPerson(p1);
        census.addPerson(p2);
        census.addPerson(p3);
        census.addPerson(p4);
        census.addPerson(p5);

        System.out.println(census);

        census.removePerson(p3);
        System.out.println(census);

    }



}
