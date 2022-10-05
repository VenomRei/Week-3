package week3;
import java.util.Scanner;
public class Acceleration {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int length;
		int seconds;		
		
		System.out.println(" What is the length? ");
		length = sc.nextInt();
		System.out.println(" What is the time? ");
		seconds = sc.nextInt();
		
		int v0 = length/seconds;
		int v1 = length/seconds;
		int t = seconds;
		int averageacceleration = (v1-v0)/t;
		
		System.out.println(" " + averageacceleration + " ");
	}
	
}
