package problem_1;

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(); //The Object type Rectangle is not declared previously or imported also my rect is not instance either.
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect area is " + myRect.area());
    }
}