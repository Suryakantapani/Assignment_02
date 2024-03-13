package Assignment_02;
class person{
	String name;
	int age;
	person(String n, int a){
		name=n;
		age=a;
	}
	void dislay() {
		System.out.println("name is "+name+"\nage is"+age);
	}
}
	class  employee extends  person{
		int Id;
		Double salary;
	 
		employee(int Id, double salary,String name, int age){
			super(name,age);
			this.Id=Id;
			this.salary=salary;
			this.name= name;
			this.age=age;
		}
		 void display() {
			 System.out.println("name is "+name+"\nage is "+age+"\nid is "+Id+"\nsalary is "+salary+" ");
		 }
		
	}

public class Q_5 {

	public static void main(String[]args) {
		person sc=new person("gopal",24);
		sc.dislay();
		employee sc1=new employee(3,10000000.00,"hari",23);
		sc1.display();
		 
	}
}

output
-------
name is gopal
age is24
name is hari
age is 23
id is 3
salary is 1.0E7 

