
interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n * n;
    }
}

class ToTestInt {
    public static void run() {
        Arithmetic a = new Arithmetic();
        System.out.println("Square of 5 = " + a.square(5));
    }
}




class Outer {

    void display() {
        System.out.println("Display method of Outer class");
    }

    class Inner {
        void display() {
            System.out.println("Display method of Inner class");
        }
    }

    public static void run() {
        Outer o = new Outer();
        o.display();

        Outer.Inner i = o.new Inner();
        i.display();
    }
}




class Point {

    private int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }

    public static void run() {
        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(10, 20);
        p2.display();

        p2.setXY(50, 60);
        p2.display();
    }
}




class Box {

    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    private double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    public static void run() {
        Box b = new Box(10, 5);
        System.out.println("Area of Box = " + b.area());

        Box3D b3 = new Box3D(10, 5, 4);
        System.out.println("Area of Box3D Base = " + b3.area());
        System.out.println("Volume of Box3D = " + b3.volume());
    }
}




public class OOPS_Problem_Week {

    public static void main(String[] args) {

        System.out.println("----- Problem 1 -----");
        ToTestInt.run();

        System.out.println("\n----- Problem 2 -----");
        Outer.run();

        System.out.println("\n----- Problem 3 -----");
        Point.run();

        System.out.println("\n----- Problem 4 -----");
        Box3D.run();
    }
}
