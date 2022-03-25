package practice06;

public class Runner {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2);
        System.out.println("Circle Radius: " + circle1.getRadius());
        System.out.println("Circle Area: " + circle1.getArea());

        Circle circle2 = new Circle(-5);
        System.out.println("Circle Radius: " + circle2.getRadius());
        System.out.println("Circle Area: " + circle2.getArea());


        Cylinder cylinder1 = new Cylinder(2,5);
        System.out.println("Cylinder Radius: " + cylinder1.getRadius());
        System.out.println("Cylinder Height: " + cylinder1.getHeight());
        System.out.println("Cylinder volume: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(2,-5);
        System.out.println("Volume: " + cylinder2.getVolume());

    }
}
