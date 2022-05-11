package day049;

public class MainApp {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();

        try {
            rect1.setWidth(5);
            rect1.setHeight(-7);
        } catch (LenghtException e) {
            System.err.println(e.getMessage());
        }

    }
}
