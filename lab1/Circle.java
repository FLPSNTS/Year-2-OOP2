public class Circle extends Shape {

    private float radius;

    //setters and getters
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(float radius){
        return this.radius;
    }

    //mandatory get area
    @Override
    public double getArea() {
        return (int) (radius * radius * Math.PI);
    }

    //constructor
    public Circle(float radius){
        super(0);
        this.radius = radius;


    }


}
