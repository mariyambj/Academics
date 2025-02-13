import java.util.Scanner;
interface Comparable{
    public double volume();
    public int compareByVolume(Comparable other);
}

class Cuboid implements Comparable{
    double length;
    double width;
    double height;
    Cuboid(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public double volume(){
        return length*width*height;
    }
    public int compareByVolume(Comparable other){
        if(volume()>other.volume())
        return -1;
        else if(volume()<other.volume())
        return 1;
        else
        return 0;
    }
    public String toString() {
        return "Cylinder(" + volume()+")";
    }
  
}
class Cylinder implements Comparable{
    double radius;
    double height;
    Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public int compareByVolume(Comparable other){
        if(volume()>other.volume())
        return -1;
        else if(volume()<other.volume())
        return 1;
        else
        return 0;
    }

    public String toString() {
        return "Cuboid (" +volume() +")";
    }
}


public class compareData{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ,width and height of the cuboid");
        double l=sc.nextDouble();
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        Cuboid c=new Cuboid(l,w,h);
        System.out.println("Enter the radius and height of the cylinder");
        double r=sc.nextDouble();
        double height=sc.nextDouble();
        Cylinder cy=new Cylinder(r,height);
        int result=c.compareByVolume(cy);
        if(result<0)
        System.out.println(c + " is smaller than " + cy);
        else if(result>0)
        System.out.println(c + "is larger than " + cy);
        else
        System.out.println(c +"and" + cy +  "are same" );
        sc.close();
    }
    
}

/*Enter the length ,width and height of the cuboid
2
3
4
Enter the radius and height of the cylinder
2
3
Cylinder(24.0)is larger than Cuboid (37.69911184307752) */
