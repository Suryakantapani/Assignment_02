package Assignment_02;
abstract class mark{
	  int icp;
	  int dsa;
	  double per;
	  mark(int icp, int dsa){
		  this.icp=icp;
		  this.dsa=dsa;
	  }
	  abstract void per();
	  
}
class CSE extends mark{
	int algo;
	CSE(int dsa, int icp,int algo){
		super(dsa, icp);
		this.algo=algo;
		this.icp=icp;
	    this.dsa=dsa;
	    System.out.println("marks are "+icp+" "+dsa+" "+algo);
	}
	public void per() {
		double per=((icp+dsa+algo)/3);
		 System.out.println("Percentage is "+per);
		 
}}
	class NON_CSE extends mark{
		int mech;
		NON_CSE(int dsa, int icp,int mech){
			super(dsa, icp);
			this.mech=mech;
			this.icp=icp;
		    this.dsa=dsa;
		    System.out.println("marks are "+icp+" "+dsa+" "+mech);
		}
		public void per() {
			double per=(icp+dsa+mech)/3;
		    System.out.println("Percentage is "+per);
	}}
public class Q6 {
	public static void main(String[]args) {
		CSE s1=new CSE(90,15,47);
		NON_CSE s2=new NON_CSE(23,43,34);
		 s1.per();
		 s2.per();
	 
		
	}

}
