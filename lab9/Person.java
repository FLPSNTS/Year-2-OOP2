public class Person {

    private float height ;
    private int age ;
    private boolean isMale;

    public void setHeight (float height) {
        this.height = height;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public void setIsMale(boolean male) {
        this.isMale = male;
    }

    public boolean getIsMale(){
        return isMale;
    }

    public float getHeight() {
        return height;
    }

    public int getAge(){
        return age;
    }

    public Person(float height, int age, boolean isMale) {
        this.height = height;
        this.age = age;
        this.isMale = isMale;

    }

    public Person(){

    }

    @Override
    public String toString(){
        return ("age: " + getAge() + "height: " + getHeight() + "Male:" + getIsMale());

    }

}
