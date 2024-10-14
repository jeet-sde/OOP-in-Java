package polymorphism;
 
class student{
    String name;
    int age;


    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name, int age){
        System.out.println(name+" "+ age);
    }
}




public class ex{
    public static void main(String[] args) {
        
    }
}
