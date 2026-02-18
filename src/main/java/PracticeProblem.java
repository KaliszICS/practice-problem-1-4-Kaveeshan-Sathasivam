import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}
	

	public static void q1() {
		//Write question 1 code here
		
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("What is your name: ");
		word = input.nextLine();
		System.out.println(word);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner number = new Scanner(System.in);
		int num;
		System.out.print("Input a whole number: ");
		num = number.nextInt();
		System.out.println((num*2)+2);

	}

	public static void q3() {
		//Write question 3 code here
		Scanner radius = new Scanner(System.in);
		double rad;
		System.out.print("Input a radius: ");
		rad=radius.nextDouble();
		System.out.println(rad*2*3.14);
		System.out.println(rad*rad*3.14);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Input a last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Input an age: ");
        int age = scanner.nextInt();

        System.out.println(lastName + ", " + firstName + " - " + age);
		


	}

	public static void q5() {
		//Write question 5 code here

		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a name:");
        String name = scanner.nextLine();

        System.out.print(" Input an age: ");
        int age = scanner.nextInt();

        int iq = age;
		age=age+3;
		System.out.print(name);
		System.out.println(age);
		System.out.println(iq);


	}

}
