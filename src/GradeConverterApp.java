/*Project 2-2: Convert number grades to letter grades
Console
Welcome to the Letter Grade Converter

Enter numerical grade: 90
Letter grade: A

Continue? (y/n): y

Enter numerical grade: 88
Letter grade: A

Continue? (y/n): y

Enter numerical grade: 80
Letter grade: B

Continue? (y/n): y

Enter numerical grade: 67
Letter grade: C

Continue? (y/n): y

Enter numerical grade: 59
Letter grade: F

Continue? (y/n): n
Operation
•	The user enters a numerical grade from 0 to 100.
•	The application displays the corresponding letter grade.
•	The application prompts the user to continue.
Specifications
•	The grading criteria is as follows:
A    88-100
B    80-87
C    67-79
D    60-67
F    <60
•	Assume that the user will enter valid integers for the grades.
•	The application should continue only if the user enters “y” or “Y” to continue.
*/
import java.util.Scanner;
public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Letter Grade Converter");
		System.out.println();
		
		Scanner keyboard = new Scanner(System.in);
		String choice = "y";
		int numericalGrade = 0;
		String letterGrade = "";			
				
				
		while (!choice.equalsIgnoreCase("n"))
		{
			//get user input
			System.out.println("Enter numerical grade: ");
			numericalGrade = keyboard.nextInt();
			System.out.println();
			
			//performs conversion until choice is not y or Y
			
			if (numericalGrade < 60)
				letterGrade = "F";
			else if (numericalGrade < 67)
				letterGrade ="D";
			else if (numericalGrade < 79)
				letterGrade = "C";
			else if (numericalGrade < 87)
				letterGrade = "B";
			else if (numericalGrade <=100)
				letterGrade = "A";
				
			System.out.println("Letter Grade: " + letterGrade);
			System.out.println();
			
			//user choice
			System.out.println("Continue? (y/n)");
			choice = keyboard.next();
			System.out.println();
				
		}
		
		
	}

}
