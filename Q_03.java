package Assignment_02;
class product{
	int prodld;
	int price;
	int quatity;
	static int totalPrice;
	product(int prodld, int price, int quatity){
		this.prodld=prodld;
	        this.price=price;
	        this.quatity=quatity;
	}
	void display() {
		System.out.println("prodld "+prodld+" price "+price+" quatity "+quatity);
	}
	static void net(product []p) {
		for(int i=0; i<5; i++) {
			totalPrice+= p[i].price * p[i].quatity;
		}
		System.out.println("Net amout "+totalPrice);
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
		int total= product.net;
		
	}
}
output
------
prodld 12 price 22 quatity 1
prodld 13 price 23 quatity 2
prodld 14 price 24 quatity 1
prodld 15 price 25 quatity 2
prodld 16 price 22 quatity 1
net amout 164
