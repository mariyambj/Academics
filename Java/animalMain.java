import java.util.Scanner;
class Animal{
    private String species;
    int weight; 
    protected String color;
    int age;
    public Animal(String species,int weight,String color,int age){
        this.age=age;
        this.weight=weight;
        this.color=color;
        this.species=species;
    }
    public void display(){
        System.out.println("Species:" + species + "\nColor:" + color + "\nWeight:" + weight + "Kg"+ "\nAge:" + age);
    }
}
class Dog extends Animal{
    String name;
    String owner;
    public Dog(String species,int weight,String color,int age,String owner,String name){
        super(species,weight,color,age);
        this.owner=owner;
        this.name=name;
    }
    public void display(){
        super.display();
        System.out.println("Name:" + name + "\nOwner:" + owner);
    }
}

class Cat extends Animal{
    int taillength;
    String eyecolor;
    String name;
    public Cat(String species,int weight,String color,int age,String name,String eyecolor,int taillength){
        super(species,weight,color,age);
        this.taillength=taillength;
        this.name=name;
        this.eyecolor=eyecolor;
    }
    public void display(){
        super.display();
        System.out.println("Name:" + name +"\nEyecolor:" + eyecolor +"\nTailength:" +taillength);

    }
}

public class animalMain {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Dog Details:");
        System.out.print("Breed: ");
        String dogBreed = scanner.nextLine();
        System.out.print("Age: ");
        int dogAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        String dogColor = scanner.nextLine();
        System.out.print("Weight: ");
        int dogWeight = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String dogName = scanner.nextLine();
        System.out.print("Owner: ");
        String dogOwner = scanner.nextLine();

        Animal a = new Dog(dogBreed, dogWeight, dogColor, dogAge, dogOwner, dogName);
        System.out.println("\nDog Details\n");
        a.display();

        System.out.println("\nEnter Cat Details:");
        System.out.print("Breed: ");
        String catBreed = scanner.nextLine();
        System.out.print("Age: ");
        int catAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        String catColor = scanner.nextLine();
        System.out.print("Weight: ");
        int catWeight = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String catName = scanner.nextLine();
        System.out.print("Eye Color: ");
        String catEyeColor = scanner.nextLine();
        System.out.print("Tail Length: ");
        int tailLength = scanner.nextInt();

        a = new Cat(catBreed, catWeight, catColor, catAge, catName, catEyeColor, tailLength);
        System.out.println("\nCat Details\n");
        a.display();

        scanner.close();
    }
}
/*Dog Details

Species:Labor
Color:Chocolate
Weight:10Kg
Age:10
Name:Eerkili
Owner:Mariyam

Enter Cat Details:
Breed: Persain-Cross
Age: 3
Color: White&Black
Weight: 3
Name: Prinku
Eye Color: Green
Tail Length: 30

Cat Details

Species:Persain-Cross
Color:White&Black
Weight:3Kg
Age:3
Name:Prinku
Eyecolor:Green
Tailength:30    cm*/
