public class Main {
    public static void main(String[] args) {
    Shape circle=new Circle(5);
    Shape triangle=new Triangle(5,6,7);
    Shape rectangle=new Rectangle(10,15);
    Shape square=new Square(8);
    Shape cub=new Cub(3);
        System.out.println(circle.getPerimeter());
        System.out.println(triangle.getPerimeter());
        System.out.println(rectangle.getPerimeter());
        System.out.println(square.getPerimeter());
        System.out.println(cub.getPerimeter());
    }
}