abstract class Shape {

    private int sides;

    // setters and getters start

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides; // modifying only this instance of the object
    }
    //setters and getters end

    //abstract function which will enforce the sub-classes to have this parameter declared

    abstract public int getArea();

    Shape(int sides) {
        this.sides = sides;
    }




}