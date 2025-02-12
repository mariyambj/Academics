import java.util.Scanner;
interface Printable{
    public void display();
    public void show();
}
interface Computable{
    public double area();
    public double perimeter();
    public double volume();
}
interface Drawable{
    public void draw();
}
class Rectangle implements Printable, Computable,Drawable{
    double width;
    double length;
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public double volume(){
        return -1;
    }
    public void display(){
        System.out.println("Area of rectangle is\t"+area());
        System.out.println("Perimeter of Rectangle is\t"+ perimeter());
        System.out.println("Volume of Rectangle is\t"+volume());
    }
    public void show(){}
    public void draw(){}
}

class Sphere implements Printable, Computable,Drawable{
    double radius;
    Sphere(double radius){
        this.radius=radius;
    }
    public double area(){
        return 4*3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
    public double volume(){
        return (4/3)*3.14*radius*radius*radius;
    }
    public void display(){
        System.out.println("Area of Sphere is\t"+area());
        System.out.println("Perimeter of Sphere is\t"+ perimeter());
        System.out.println("Volume of Sphere is\t"+volume());
    }
    public void show(){}
    public void draw(){}
}



public class RDemo{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and width of the Rectangle");
        double len = sc.nextDouble();
        double wid = sc.nextDouble();
        System.out.println("Enter the radius of Sphere");
        double radius=sc.nextDouble();
        Rectangle r=new Rectangle(len,wid);
        Sphere c=new Sphere(radius);
        r.display();
        c.display();
    }
}

/*Enter the length and width of the Rectangle
2
3
Enter the radius of Sphere
3
Area of rectangle is    6.0
Perimeter of Rectangle is       10.0
Volume of Rectangle is  -1.0
Area of Sphere is       113.03999999999999
Perimeter of Sphere is  18.84
Volume of Sphere is     84.78 */