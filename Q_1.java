package Assignment_02;
import java.util.Scanner;
class Person{
	int age;
	String name;
	void hari(String name , int age) {
		  this.name=name;
		  this.age=age;
		  System.out.println("name is "+name+"\nage is"+age);
		   }
  void setdata(String name , int age) {
	  this.name=name;
	  this.age=age;
	   }
 void  displaydata() {
	 System.out.println("name is "+name+"\nage is "+age);
		 }
 }
public class Q_1 {
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name and age of second person :");
		Person sc2=new Person();
		sc2.name=sc.nextLine();
		sc2.age=sc.nextInt();
		Person sc1=new Person();
		sc1.setdata("gopal", 28);
		sc1.displaydata();
		 
		if(sc1.age>sc2.age)
			System.out.println(sc2.name+" is younger");
		else if(sc1.age<sc2.age)
			System.out.println(sc1.name+" is younger");
		else 
			System.out.println("both has same age");
	}

}

 