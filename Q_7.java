package Assignment_02;
interface detaillInfo{
	void display();
	int count();
	 
}
class Perso implements detaillInfo{
	String member;
	static int max_count=5;
	public void person(String name) {
		member=name;
	}
	public void display() {
		System.out.println(member);
	}
	public int count() {
		return member.length();
	}
	
}
public class Q_7 {
	public static void main(String[]args) {
		Perso p1=new Perso();
		p1.person("simon");
		p1.display();
		System.out.println(p1.count());
	}

}
