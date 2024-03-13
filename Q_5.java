package Assignment_02;
class person{
	String name;
	int age;
	person(String n, int a){
		name=n;
		age=a;
	}
}
class  employee extends  person{
	int Eid;
	double salary;
	employee(int Id, double salary,String name, int age){
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	void empDisplay() {
		System.out.println("name is "+name+"\nage is "+age+"\nid is "+Eid+"\nsalary is "+salary+" ");
	}
		
}

public class Q_5 {
	public static void main(String[]args) {
		employee sc1=new employee(3,10000000.00,"hari",23);
		sc1.empDisplay();
		 
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

