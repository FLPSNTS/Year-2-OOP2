public class Ellipse extends Rectangle {

    private float semiheight = super.getHeight() /2;
    private float semiwidth = super.getWidth() /2;

    public float getSemiheight() {
        return semiheight;
    }
    public float getSemiwidth() {
        return semiwidth;
    }

    @Override
    public double getArea() {
        return Math.PI * semiwidth * semiheight;
    }

    public Ellipse(float height, float width) {
        super(height, width);
    }
}
