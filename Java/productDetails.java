import java.util.*;
class Products{
    String name;
    int price;
    public Products(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return "Name of the Product:" + name + "\nMarked Price:" + price + "/kg";
    }
}
public class productDetails {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        ArrayList<Products> p=new ArrayList<>();
        int ch,pr;
        String name;
        while(true){
            System.out.println("Enter the choice\n1.Add Product\n2.Sort Product by name\n3.Display Product\n4.Exit");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:System.out.println("Enter the product name and its Marked price:\n");
                    name=sc.nextLine();
                    pr=sc.nextInt();
                    sc.nextLine();
                    p.add(new Products(name,pr));
                    break;
                case 2:System.out.println("....Sorted list of products.....\n");
                    Collections.sort(p, Comparator.comparing((Products pro)->pro.name));
                    System.out.println(p);
                    break;
                case 3:System.out.println("...Product Details...\n");
                    for (Products x:p)
                    System.out.println(x);
                    break;
                case 4:System.exit(0);
                sc.close();
            }
        }

    }
    
}
/*Enter the choice
1.Add Product
2.Sort Product by name
3.Display Product
4.Exit
1
Enter the product name and its Marked price:

Rice
50
Enter the choice
1.Add Product
2.Sort Product by name
3.Display Product
4.Exit
1
Enter the product name and its Marked price:

Flour
45
Enter the choice
1.Add Product
2.Sort Product by name
3.Display Product
4.Exit
3
...Product Details...

Name of the Product:Rice
Marked Price:50/kg
Name of the Product:Flour
Marked Price:45/kg
Enter the choice
1.Add Product
2.Sort Product by name
3.Display Product
4.Exit
2
....Sorted list of products.....

[Name of the Product:Flour
Marked Price:45/kg, Name of the Product:Rice
Marked Price:50/kg]
Enter the choice
1.Add Product
2.Sort Product by name
3.Display Product
4.Exit */
