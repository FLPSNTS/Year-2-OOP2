public class Driver8 {

    public static void main (String[] args) {


        EmailStore storer = new EmailStore();

        System.out.println("Email added succesfully: " + storer.addEmail("test1@gmail.com"));
        System.out.println("Email added succesfully: " + storer.addEmail("test2@gmail.com"));
        System.out.println("Email added succesfully: " + storer.addEmail("test2@gmail.com"));
        System.out.println("Email added succesfully: " + storer.addEmail("test3@gmail.com"));


        System.out.println("Email check :" + storer.returnEmail("test4@gmail.com"));
        System.out.println("Email check :" + storer.returnEmail("test3@gmail.com"));

        storer.displayEmails();




//other version
        //public class Driver8 {
        //
        //    public static void main (String[] args) {
        //
        //        EmailStore storer = new EmailStore();
        //
        //        String e1 = "test1@gmail.com";
        //        String e2 = "test2@gmail.com";
        //        String e3 = "test3@gmail.com";
        //
        //        System.out.println("Email " + e1 + " was added: " + storer.addEmail(e1));
        //        System.out.println("Email " + e2 + " was added: " + storer.addEmail(e2));
        //        System.out.println("Email " + e2 + " was added: " + storer.addEmail(e2));
        //        System.out.println("Email " + e3 + " was added: " + storer.addEmail(e3));
        //
        //        System.out.println("Email check (" + "test4@gmail.com" + "): " + storer.returnEmail("test4@gmail.com"));
        //        System.out.println("Email check (" + e3 + "): " + storer.returnEmail(e3));
        //
        //        storer.displayEmails();
        //    }
        //}



    }
}










