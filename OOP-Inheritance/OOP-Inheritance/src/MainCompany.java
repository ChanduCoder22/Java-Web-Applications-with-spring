
public class MainCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kumar = new Employee(1452,"Kumar","Developer",24563.25f);
		Manager  prasad = 
			new Manager(145875,"Vara Prasad", "Tech Manager",56321.25f, 25);
		System.out.println("Employee Details");
		kumar.showDetails();
		System.out.println("Manager Details");
		prasad.getDetails();
		
		kumar.computeHra();
		prasad.computeHra();

	}

}
