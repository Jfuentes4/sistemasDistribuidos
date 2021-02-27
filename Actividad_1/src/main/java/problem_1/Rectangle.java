package problem_1;

public class Rectangle {
    public int width;
    public int height;
    //constructor 1
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    //constructor 2
    public Rectangle() {
    }

    public int area () {
        return this.width * this.height;
    }
}
