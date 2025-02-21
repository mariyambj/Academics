import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class nameDemo{
    public static void main(String[]arg){
        int ch;
        String name;
        ArrayList <String> names=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Add names\n2.Remove name\n3.Search a name\n4.Sort names\n5.Display names\n6.Exit");
            System.out.println("Enter the your choice:");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.println("Enter the name:");
                    name=sc.nextLine();
                    names.add(name);
                    break;
                case 2:
                    System.out.println("Enter the name to be removed");
                    name=sc.nextLine();
                    if(names.contains(name))
                        names.remove(name);
                    else
                        System.out.println("Name not in the list");
                    break;
                case 3:
                    System.out.println("Enter the name to be searched:");
                    name=sc.nextLine();
                    if(names.indexOf(name)<0)
                        System.out.println("Name not present in the list");
                    else
                        System.out.println(name +"\tis present at index\t" +names.indexOf(name));
                    break;
                case 4:
                    System.out.println("The sorted name list:\n");
                    Collections.sort(names);
                    System.out.println(names);
                    break;
                case 5:
                    for(String x:names)
                    System.out.println(x);
                    break;
                case 6:System.exit(0);
                sc.close();

            }
            
        }

       
    }
}