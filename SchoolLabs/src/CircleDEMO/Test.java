package CircleDEMO;

public class Test {
        public static void main(String[] args){
        double num = 5.0;
        Circle circle = new Circle (5.0);

        modify(num, circle);

        System.out.println("num after method call: " + num);
        System.out.println("circle.radius after method call: " +circle.radius);
    }

    static void modify (double x, Circle y) {
            x = x * 2;
            y.radius = y.radius * 2;
    }
}
