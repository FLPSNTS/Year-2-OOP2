abstract class Shape {
    //variables
    private int sides;

    // setters and getters start
    public int getSides() {
        return sides;
    }
    public void setSides(int sides) {
        this.sides = sides; // modifying only this instance of the object
    }

    //abstract function which will enforce the sub-classes to have this parameter declared
    abstract public double getArea();

    //constructor
    Shape(int sides) {
        this.sides = sides;
    }




}