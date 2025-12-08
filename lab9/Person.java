public class Person {

    private int height ;
    private int age ;
    private boolean isMale;

    public void setHeight (int height) {
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

    public int getHeight() {
        return height;
    }

    public int getAge(){
        return age;
    }

    public Person(int height, int age, boolean isMale) {
        this.height = height;
        this.age = age;
        this.isMale = isMale;

    }

    public Person(){

    }

    @Override
    public String toString(){
        String gender = "";
        
        if (getIsMale() == false){
            gender = "Female";
            
        }
        return ("age: " + getAge() + "height: " + getHeight() + "Male:" + gender);

    }

}
