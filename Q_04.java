package Assignment_02;
class Deposit{
	long p;
	int time;
	double rate;
	double t_p;
	Deposit(){
		p=100;
		time=1;
		rate=5.7;	
	}
	Deposit(long p,int t, double r){
		this.p=p;
		this.time=t;
		this.rate=r;
	}
	Deposit(long p,int t){
		this.p=p;
		this.time=t;
		this.rate=4.5;
	}
	Deposit(long p,double r){
		this.p=p;
		this.time=4;
		this.rate=r;
	}
	void display() {
		System.out.println("princial "+p+" time "+time+"rate "+rate);
		t_p=p+(p*time*rate)/100;
		System.out.println(t_p);
	}
}

public class Q_04 {
	public static void main(String[]args) {
		Deposit sc[]=new Deposit[4];
		sc[0]=new Deposit();
		sc[1]=new Deposit(100,3,4.5);
		sc[2]=new Deposit(100,3);
		sc[3]=new Deposit(100,3.4);
	
	for(int i=0; i<4; i++){
		sc[i].display();
	}
	}
}
