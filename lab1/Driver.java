public class Driver {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(5, 5);
        Shape s2 = new Rectangle(7, 4);
        Shape s3 = new Circle(5);
        Shape s4 = new Ellipse(5F, 6.2F);
        System.out.println("The first triangle area is " + s1.getArea() + "\n and the area of the second rectangle is "+
                s2.getArea());
        System.out.println("the circle 1 area is " + s3.getArea());
        System.out.println("the Ellipse area is " + s4.getArea());

    }
}