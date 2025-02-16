interface Dim{
    public double area(int x);

}

public class DimDemo {
    public static void main(String []arg){

    Dim d=(x)->x*x;
    Dim a=(x)->6*x*x;
    Dim b=(x)->4*Math.PI*x*x;
    Dim c=(x)->Math.PI*x*x;
    System.out.println("Area of Square is:"  + d.area(2));
    System.out.println("The area of cube is" + a.area(3)); 
    System.out.println("Area of sphere is:"  + b.area(4));
    System.out.println("Area of circle is:"  + c.area(5));
    
    }
}
