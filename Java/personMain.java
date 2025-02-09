import java.util.Scanner;
class Person{
    String name;
    String gender;
    String address;
    int age;
    public Person(String name,String gender,String address,int age){
        this.gender=gender;
        this.age=age;
        this.name=name;
        this.address=address;
    }
    public void display(){

        System.out.println("Name:" + name + "\nGender:" + gender + "\nAddress:" + address + "\nAge:" + age);
    }
}
class Employe extends Person{
    int empid;
    String cmpname;
    String qlf;
    float salary;
    public Employe(String name,String gender,String address,int age,int empid,String cmpname,String qlf,float salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.cmpname=cmpname;
        this.qlf=qlf;
        this.salary=salary;
    }
    public void display(){
        super.display();
        System.out.println("Employee id:MCA" + empid + "\nCompany Name: " + cmpname + "\nQualification:" + qlf + "\n Salary:" +salary);
    }
}

class Teacher extends Employe{
    int tchrid;
    String sub;
    String dept;
    public Teacher(String name,String gender,String address,int age,int empid,String cmpname,String qlf,float salary,int tchrid,String sub,String dept){
        super(name,gender,address,age,empid,cmpname,qlf,salary);
        this.tchrid=tchrid;
        this.sub=sub;
        this.dept=dept;

    }
    public void display(){
        super.display();
        System.out.println("Teacherid:" +tchrid + "\nSubject:" + sub + "\nDepartment:" + dept );
    }
}

public class personMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array of Teacher objects
        Teacher[] t = new Teacher[num];

        // Loop to take input for each teacher
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Company Name: ");
            String cmpname = scanner.nextLine();
            System.out.print("Qualification: ");
            String qlf = scanner.nextLine();
            System.out.print("Salary: ");
            float salary = scanner.nextFloat();
            System.out.print("Teacher ID: ");
            int tchrid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Subject: ");
            String sub = scanner.nextLine();
            System.out.print("Department: ");
            String dept = scanner.nextLine();

            t[i] = new Teacher(name, gender, address, age, empid, cmpname, qlf, salary, tchrid, sub, dept);
        }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < t.length; i++) {
            System.out.println("-----------------------------");
            System.out.println("Teacher " + (i + 1) + " Details:");
            t[i].display();
        }
        scanner.close();
    }
}

