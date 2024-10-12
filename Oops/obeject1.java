class student{
    String name;
    int age;

    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


public class obeject1 {

    public static void main(String[] args) {
        
    
    student studentobj = new student();
    studentobj.name = "jeet";
    studentobj.age =21;
    studentobj.studentinfo();
    }
    
}
