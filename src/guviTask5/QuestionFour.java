package guviTask5;
import java.util.Scanner;
import java.time.LocalDate;

public class QuestionFour {

	public static void main(String[] args) {
	   Scanner mps=new Scanner(System.in);
	   System.out.println("Enter the year");
	   int year=mps.nextInt();
	   System.out.println("Enter the month");
	   int month=mps.nextInt();
	   System.out.println("Enter the date");
	   int day=mps.nextInt();
	   
	   LocalDate birthDate=LocalDate.of(year,month,day);
	   System.out.println("The Birth Date Is:"+birthDate);
	   
	   LocalDate currentDate=LocalDate.now();
	   System.out.println("The Current Date Is:"+currentDate);
	   int age;
	   age=currentDate.getYear()-birthDate.getYear();
	   System.err.println("The Age Is:"+age);

	}

}
