//import java.util.Scanner;
class CPU{
    int price;
    public CPU(int price){
        this.price=price;
    }
    public void display(){
        System.out.println("Price:"+price);
    }
    class Processor{
        String core;
        String manufacturer;
        public Processor(String core,String manufacturer){
            this.core=core;
            this.manufacturer=manufacturer;
        }
        public void displayProcessor(){
            System.out.println("Core:"+core);
            System.out.println("Manufacturer:"+manufacturer);
        }
    }
    static class RAM{
        String memory;
        String manufacturer;
        public RAM(String memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        public void displayRAM(){

            System.out.println("Memory:"+memory);
            System.out.println("Manufacturer:"+manufacturer);
        }
    }
}

public class cpuMain{
    public static void main(String[]arg){
        CPU cpu=new CPU(1000);
        CPU.Processor p=cpu.new Processor("i5","IntelCore");
        CPU.RAM r=new CPU.RAM("4GB","HP");
        cpu.display();
        p.displayProcessor();
        r.displayRAM();
    }
}