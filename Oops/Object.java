//objects and class
import javafx.scene.effect.Light.Spot;

class pen {
    String color;
    String type; // ballpoint; get

    public void write(){
        System.out.println("writing something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }

}



public class OOPS{
  
    public static void main(String[] args){
        pen pen1 = new pen();
        pen1.color ="blue";
        pen1.type ="gel";
        pen1.write();

        pen pen2 = new pen();
        pen2.color ="black";
        pen2.type ="ballpoint";

        pen1.printcolor();
        pen2.printcolor();


    }



}