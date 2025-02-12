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
  
}


public class compareData{
    public static void main(String[] arg){
        Cuboid c=new Cuboid(2,3,4);
        Cuboid c1=new Cuboid(5,6,7);
        int result=c.compareByArea(c1);
        if(result<0)
        System.out.println(c+" is smaller than "+c1);
        else if(result>0)
        System.out.println(c+"is larger than " +c1);
        else
        System.out.println("Both are same");
    }
}
