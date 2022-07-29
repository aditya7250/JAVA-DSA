package CLASSandOBJECT;
		class Empll{
			//System.out.println("Hello Employee");//error
			void m() {
				System.out.println("Hello Employee");
			}
			private String name;
			private int salary=9000;
			//salary=9000;//error
			void m2() {
				salary=567000;
			}
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
		public class ClassObjectEx6 {

			public static void main(String[] args) {
			
				Empll a=new Empll();
				Empll b=new Empll();
				Empll c=new Empll();
				Empll d=new Empll();
				
				a.show();
				b.show();
				c.show();
				d.show();
				
				a.input("Teja Gupta", 86000, "ABC");
				b.input("Yoyo Sharma", 78000, "ABC");
				c.input("Cheetah Khan", 96000, "ABC");
				d.input("Lalu Kumar", 21, "MNO");
				
				a.show();
				b.show();
				c.show();
				d.show();
				
				a.m();
				b.m();
			}
		}
