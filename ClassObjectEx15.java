package CLASSandOBJECT;
class H{
	int x=10;
	String y="Rahul";
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectEx15 {

	public static void main(String[] args) {
		H a= new H();
		H b= new H();
		a.x=15;
		a.show();
		a.y="YoYo";
		b.show();
		b.y="Ramu";
		a.show();
		b.show();
	}
}
