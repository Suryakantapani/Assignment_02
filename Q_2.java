package Assignment_02;
class Complex{
	double real;
	double imag;
	void setdata(double x, double y) {
		real=x;
		imag=y;
	}
	void display() {
		System.out.println("complex number : "+real+"+("+imag+"i) ");
	}
	public Complex add(Complex x, Complex y) {
		Complex c = new Complex();
	        c.real=x.real+y.real;
	        c.imag=x.imag+y.imag;
	        return c;
	}
}
public class Q_2 {
	public static void main(String []args) {
		Complex sc = new Complex();
		sc.setdata(3,-8);
		sc.display();
		
		Complex sc1 = new Complex();
		sc1.setdata(-4,5);
		sc1.display();
  Complex sc2=new Complex();
		Complex sum= new Complex();
		sum=sum.add(sc1,sc);
		sum.display();
	}
}

output
---------	
complex number : 3+(-8i) 
complex number : -4+(5i) 
addtion of num is -1-3i







