package Assignment_02;
class Deposit{
	long principal;
	int time;
	double rate;
	double totalAmt;
	
	Deposit(){
		principal=100;
		time=1;
		rate=5.7;	
	}
	Deposit(long principal,int time, double rate){
		this.principal=p;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long principal,int time){
		this.principal=principal;
		this.time=time;
		this.rate=4.5;
	}
	Deposit(long principal,double rate){
		this.principal=principal;
		this.time=4;
		this.rate=rate;
	}
	void display() {
		System.out.println("princial "+p+" time "+time+"rate "+rate);
	}
	double calcAmt(){
        totalAmt= principal+(principal*rate*time)/100;
        System.out.println( totalAmt);
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
			sc[i].calcAmt();
		}
	}
}

output
--------
princial 100 time 1rate 5.7
105.7
princial 100 time 3rate 4.5
113.5
princial 100 time 3rate 4.5
113.5
princial 100 time 4rate 3.4
113.6
