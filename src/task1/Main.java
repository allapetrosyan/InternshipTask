package task1;

public class Main {


        public static void main(String[] args) {

            Point point1 = new Point(4,7);
            point1.distance();

            Point point2 = new Point(1,1);
            point1.distance(point2);
            System.out.println(point1.distance());
            System.out.println(" ");
            System.out.println( point1.distance(point2));

        }
}
