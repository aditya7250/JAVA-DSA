package CLASSandOBJECT;
		class Empl{
			private String name;
			private int salary;
			private String cname;
			void input(String n,int s,String c) {
				name=n;
				salary=s;
				cname=c;
			}
			public void show() {
				System.out.println(name+" "+salary+" "+cname);
			}
		}
		public class ClassObjectEx4 {

			public static void main(String[] args) {
				Empl a=new Empl();
				Empl b=new Empl();
				Empl c=new Empl();
				Empl d=new Empl();
				
				a.input("Teja Gupta", 86000, "ABC");
				b.input("Yoyo Sharma", 78000, "ABC");
				c.input("Cheetah Khan", 96000, "ABC");
				d.input("Lalu Kumar", 21, "MNO");
				
				a.show();
				b.show();
				c.show();
				d.show();
				
				//int sum=a.salary+b.salary+c.salary+d.salary; //error
				//System.out.println(sum);
			}
}
