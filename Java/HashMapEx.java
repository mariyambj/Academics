import java.util.HashMap;
import java .util.Map;
import java.util.Scanner;
public class HashMapEx{
    public static void main(String []arg){
        HashMap<Integer,String> student=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int roll,s;
        String name;
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the roll number:");
            roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the student name:");
            name=sc.nextLine();
            student.put(roll,name);
        }
        /*for(Map.Entry <Integer,String> e:student.entrySet()){
            int id=e.getkey();
            String sname=e.getValue();
            System.out.println(id + ":" + sname);
        }*/
        System.out.println("Enter the student roll number:");
        s=sc.nextInt();
        sc.nextLine();
        System.out.println("Student Name:"+ student.get(s));
        

    }
    
}