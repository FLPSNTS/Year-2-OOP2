public class Rectangle extends Shape {

    private int height;
    private int width;

    //declaring the mandatory abstract GetArea from Shape
    @Override
    public int getArea() {
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int height, int width) {
        super(4);
        this.height = height;
        this.width = width;
    }
}