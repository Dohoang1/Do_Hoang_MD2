public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        MoveablePoint p2 = new MoveablePoint(p1.getX(), p1.getY(),1,1);
        System.out.println(p1);
        System.out.println(p2);
        p2.move();
        System.out.println(p2);
    }
}