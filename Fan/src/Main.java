// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "Yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "Blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}