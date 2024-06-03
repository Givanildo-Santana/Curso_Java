package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


public class program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter Worker data");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.next();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));
	
		System.out.print("How many contracts to this worker? ");
		int nContracts = sc.nextInt();
		sc.nextLine();
		
		for(int x=1; x<=nContracts;x++) {
			System.out.println("Enter contract #"+x + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			sc.nextLine();
			
			worker.addContract(new HourContract(contractDate,valuePerHour,duration));
		}
		
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.nextLine();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",worker.income(month, year)));
		
				
	}

}
