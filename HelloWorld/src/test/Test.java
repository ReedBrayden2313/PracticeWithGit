package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int num1 = (int) (Math.random()* 15);
int num2 = (int) (Math.random()* 15);

System.out.println("What is " + num1 + " + " + num2 + "?" );
int answer = input.nextInt();
int correct = num1 + num2;
if (answer == num1 + num2) {
	System.out.println("You are correct");
}
else {
	System.out.println("That is not the correct answer. " + "It should be " + correct );
}
input.close();
	}

}
