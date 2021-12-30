package ExercicioPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n=sc.nextInt();

	for(int i=1; i<=n; i++) {
		System.out.println("Employee #"+i+" data: ");
		System.out.print("Outsourced (y/n)? ");
		char ch = sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.print("Hours: ");
		int hours=sc.nextInt();
		System.out.print("Value per hour: ");
		double valuePerHours=sc.nextDouble();
		if(ch=='Y'||ch=='y') {
			System.out.print("Additional charge: ");
			double additionalCharge=sc.nextDouble();
						
			Employees emp = new OutsourceEmployees(name, hours,valuePerHours, additionalCharge);
			list.add(emp);
		}else {
			Employees emp = new Employees(name, hours, valuePerHours);
			list.add(emp);
		}
	}
	System.out.println();
	System.out.println("PAYMENTS: ");
	for(Employees emp : list) {
		System.out.println(emp.getName()+" - $ "+String.format("%.2f", emp.payment()));
	}
	sc.close();
	}
}