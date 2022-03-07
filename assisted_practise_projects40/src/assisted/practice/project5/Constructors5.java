package assisted.practice.project5;

public class Constructors5 {

		String name;
		int rollno;
		
		public Constructors5() {
		}

		Constructors5(String name, int rollno) {
			this.name = name;
			this.rollno = rollno;

		}

		public static void main(String[] args) {

			Constructors5 per1 = new Constructors5("Srinu", 206);
			Constructors5 per2 = new Constructors5("Shekar", 207);
			Constructors5 per3= new Constructors5("Sai", 213);
			Constructors5 per4 = new Constructors5("Rohith", 219);
			System.out.println("Name of per1 is=" +per1.name);
			System.out.println("Roll number of per1 is=" + per1.rollno);
			System.out.println("Name of per2 is="+per2.name);
			System.out.println("Roll number of per2 is="+per2.rollno);
			System.out.println("Name of per3 is=" +per3.name);
			System.out.println("Roll number of per3 is=" + per3.rollno);
			System.out.println("Name of per4 is=" + per4.name);
			System.out.println("Roll number of per4 is=" + per4.rollno);
		

	}

}
