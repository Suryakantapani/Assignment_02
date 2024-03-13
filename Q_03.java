package Assignment_02;
class product{
	int prodld;
	int price;
	int quatity;
	static int t_p;
	product(int prodld, int price, int quatity){
		this.prodld=prodld;
	    this.price=price;
	    this.quatity=quatity;
	}
	void display() {
		System.out.println("prodld "+prodld+" price "+price+" quatity "+quatity);
		t_p=t_p+price*quatity;
		 
	}
	static void net() {
		System.out.println("net amout "+t_p);
	}
}
public class Q_03 {
	public static void main(String[]args) {
		product  sc[]=new product[5];
	  sc[0]=new product(12,22,1);
	  sc[1]=new product(13,23,2);
	  sc[2]=new product(14,24,1);
	  sc[3]=new product(15,25,2);
	  sc[4]=new product(16,22,1);
	  
		for(int i=0; i<5; i++) {
			sc[i].display();
		}
		sc[4].net();
	}

}
