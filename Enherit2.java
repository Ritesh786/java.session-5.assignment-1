
public class Enherit2 extends Enherit {

		double traingle (double b,double h){
			double k= (b*h)/2;
			return k;
		}
		public static void main(String[] args) {
			Enherit2 obj=new Enherit2();
			
			
			System.out.println(obj.rectangle(2.0, 3.0));
			System.out.println(obj.traingle(2.0, 9.0));
	}


}