public class Rectangle extends Shape {

    private float height;
    private float width;

    //declaring the mandatory abstract GetArea from Shape
    @Override
    public double getArea() {
        return height * width;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public float getWidth(){
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }


    public Rectangle(float height, float width) {
        super(4);
        this.height = height;
        this.width = width;
    }
}