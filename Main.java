package preassignment;

import java.util.Scanner;


public class Main {
	
	//function to check Palindrome
	public boolean checkPalindrome(int n) {
		
		String s1 = Integer.toString(n);
		
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2))
			return true;
		return false;
	}
	
	//function to print pattern
	public void printPattern(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
	
	//function to check prime number
	public boolean checkPrime(int n) {
		
		if(n<=1) {
			return false;
		} else if(n == 2) {
			return true;
		} else if (n % 2 == 0) {
			return false;
		} 
		
		for(int i=3; i<= Math.sqrt(n) ; i += 2) {
			if(n % i == 0)
				return false;	
		}
		return true;
		
	}
	
	//function to print fibonacci series
	public void printFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print(0 + " " + 1 + " " );
		for(int i=1; i<n; i++ ) {
			c = a + b;
			System.out.print(c+ " " );
			a = b;
			b = c;
		}
		System.out.println();
		 
	}

	public static void main(String[] args) {
		
		Main obj = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("Enter your choice from below list.\n" + "1. Find if a number is palindrome.\n"
			+ "2. Print pattern for a given number\n" + "3. Check if a number is prime number.\n"
			+ "4. Print Fibonacci Series.\n" + "---> Enter 0 to Exit.\n");
			
			System.out.println();
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 0: break;
			
			case 1: 
				System.out.println("Enter the number to know if it is Palindrome: ");
				int i = sc.nextInt();
				if(obj.checkPalindrome(i))
					System.out.println("This is a Palindrome Number.");
				else
					System.out.println("This is not 0a Palindrome Number.");
				break;
			case 2:
				System.out.println("Enter the number to print the pattern: ");
				int j = sc.nextInt();
				obj.printPattern(j);
				break;
			case 3:
				System.out.println("Enter the number to know if it is prime: ");
				int k = sc.nextInt();
				if(obj.checkPrime(k))
					System.out.println("This is a prime number.");
				else
					System.out.println("This is not a prime number.");
				break;
			case 4:
				System.out.println("Enter the number to print fibonacci squence: ");
				int l = sc.nextInt();
				obj.printFibonacciSeries(l);
				break;
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			
			}
		
			
		} while(choice != 0);
		System.out.println("Program exited sucessfully!!");
		sc.close();

	}

}
