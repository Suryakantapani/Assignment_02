package Assignment_02;
import java.util.Scanner;
class Person{
	int age;
	String name;
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
		Person p1=new Person();
		p1.name="Rohan";
		p1.age=20;
		p1.displaydata();

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name and age of second person :");
		Person p2=new Person();
		p2.setdata("Gopal", 28);
		p2.displaydata();
		 
		if(p1.age>p2.age)
			System.out.println(p2.name+" is younger");
		else if(p1.age<p2.age)
			System.out.println(p1.name+" is younger");
		else 
			System.out.println("Both have same age");
	}

}

 
