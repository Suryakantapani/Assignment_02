//Create two packages q8pack1 and q8pack2
//Create q8.java in q8pack1
package q_8pack1;
import java.util.Scanner;
import q_8pack2.Sports;

class Student{
    String name;
    int roll;
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter student name: ");
        name= sc.nextLine();
        System.out.println("Enter roll no: ");
        roll=sc.nextInt();
    }
    public void output(){
        System.out.println("Name: "+name+", Roll no: "+roll);
    }
}
class Test extends Student{
    int mark1, mark2;
    public void input(){
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter mark1: ");
        mark1=sc.nextInt();
        System.out.println("Enter mark2: ");
        mark2=sc.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("Mark1: "+mark1+", Mark2: "+mark2);
    }
}
class GrandTotal extends Test implements Sports{
    public void input(){
        super.input();
    }

    public void output(){
        super.output();
        System.out.println("Score 1: "+score1+" and Score 2: "+score2);
        System.out.println("Total mark "+(mark1+mark2)+" and total Score "+(score1+score2));
        System.out.println("Grand total : "+(mark1+mark2+score1+score2));
    }

}
public class q8 {
    public static void main(String[] args) {
        GrandTotal g1= new GrandTotal();
        g1.input();
        g1.output();
    }
}


//Create Sports.java in q8pack2
package q_8pack2;
public interface Sports{
    int score1=0;
    int score2=0;
}

class sport {
    public static void main(String[] args) {

    }
}
