package Assignment_02;
class complex{
	int real;
	int imag;
	void setdata(int x, int y) {
		real=x;
		imag=y;
	}
	void display() {
		System.out.println("complex number : "+real+"+("+imag+"i) ");
	}
	void add(complex x, complex y) {
	    this.real=x.real+y.real;
	    this.imag=x.imag+y.imag;
	    System.out.println("addtion of num is "+this.real+this.imag+"i");
	}
}
public class Q_2 {
	public static void main(String []args) {
		 
		complex sc=new complex();
		sc.setdata(3,-8);
		sc.display();
		complex sc1=new complex();
		sc1.setdata(-4,5);
		sc1.display();
		complex sc2=new complex();
		sc2.add(sc1, sc);
	}

}
