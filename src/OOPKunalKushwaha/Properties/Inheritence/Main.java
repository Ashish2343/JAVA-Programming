package OOPKunalKushwaha.Properties.Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(12,3,4);
        Box box2 = new Box(box1);
        System.out.println(box2.h);
        System.out.println(box2.w);
    }
}
