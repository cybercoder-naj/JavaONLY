
class Emp{
		double eid;
		double salary;
		static String ceo;
		
		
		static {
			ceo = "Soham";
		}
		public Emp(double eid,double salary){
			this.eid = eid;
			this.salary = salary;	
		}
		public void show() {
			System.out.println(eid + " : "+ salary + " ceo: "+ ceo);
		}
	}

public class StaticDemo {

	public static void main(String[] args) {
		Emp rahul = new Emp(1,1000);
		Emp mahesh = new Emp(2, 4000);
		rahul.show();
		mahesh.show();

	}

}
