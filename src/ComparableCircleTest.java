import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];

        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red",true,3.5);

        System.out.println("truoc");

        for (ComparableCircle circle : circles) {
            System.out.println(circle);

        }

        Arrays.sort(circles);

        System.out.println("sau");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }
}
