package situation;

import java.util.Scanner;

public class Student {
		
			Scanner scan = new Scanner(System.in);
			String name;
			double grade1;
			double grade2;
			double grade3;
			double average;
			String situation;
			
			
			public void inputGrade() {
			
			// Inputting the student's name and the 3 grades
			System.out.print("Enter the student's name: ");
			name = scan.next();
			
			System.out.print("Type the first grade: ");
			grade1 = scan.nextDouble();
			
			System.out.print("Enter the second grade: ");
			grade2 = scan.nextDouble();
			
			System.out.print("Enter the third note: ");
			grade3 = scan.nextDouble();
			
			// Average calculation
			average = (grade1 + grade2 + grade3) /3;
			
			/** Aplicação da condicional para setar o valor da variável situation */
			if(average>=7) {
				situation = ("Approved!");
			}else {
				situation = ("Reproved!");
			}
			
			System.out.println("The average of the student "+name+" was "+average);
			System.out.print(name+" is "+situation);
			}	
	}
