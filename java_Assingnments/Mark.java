package java_Assingnments;

import java.util.*;

public class Mark {
		// TODO Auto-generated method stub
		public static void calculate(int m1, int m2, int m3) {
			int total = m1+m2+m3;
			double average = total/3.0;
			System.out.println("Total marks: "+total);
			System.out.println("Average: "+average);
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter marks of Subject 1: ");
			int m1 = sc.nextInt();
			System.out.println("Enter marks of Subject 2: ");
			int m2 = sc.nextInt();
			System.out.println("Enter marks of Subject 3: ");
			int m3 = sc.nextInt();
			calculate(m1, m2, m3);
			sc.close();

	}

}
