package CLASSandOBJECT;
		class Employeeeeee{
			private String name;		
			private int salary;	
			private String cname;		
			void show() {				
				System.out.println(name+" "+salary+" "+cname);
			}
			public void input() {	
				java.util.Scanner sc=new java.util. Scanner( System.in );
				
				System.out.println("Enter Name: ");
				name=sc.next();
				System.out.println("Enter Salary: ");
				salary=sc.nextInt();
				System.out.println("Enter Company Name: ");
				cname=sc.next();
			}
		}
		public class ClassObjectEx5 {

			public static void main(String[] args) {
				Employeeeeee a=new Employeeeeee();
				Employeeeeee b=new Employeeeeee();
				Employeeeeee c=new Employeeeeee();
				Employeeeeee d=new Employeeeeee();
				
				a.input();
				b.input();
				c.input();
				d.input();

				a.show();
				b.show();
				c.show();
				d.show();
			}
		}
