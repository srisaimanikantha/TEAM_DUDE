package com.basic;

public class OperatorsExamples {

	public static void main(String[] args) {
		
				arithmeticOperators();
				
				typeCastWidening();
				System.out.println("====================");
				typeCastNarrowing();
			}

			private static void typeCastNarrowing() {

				System.out.println("====  Narrowing =====");
				int n = 345621;
				byte b = (byte)n;
				System.out.println("byte value:"+b);
			}
			private static void typeCastWidening() {

				System.out.println("=====  Widening =====");
				int n = 3456;
				long l = n;
				System.out.println("Long value: "+l);
			}

			static  void arithmeticOperators() {

				System.out.println("+ , - , *, / , %");
				
				System.out.println(3+6);
				System.out.println(6-2);
				System.out.println(6*3);
				
				System.out.println("==============");
				System.out.println("/ division -> quotient");
				System.out.println(8/3);
				System.out.println(5/8);
				System.out.println("% modulus -> remainder");
				System.out.println(8%3);
				System.out.println(12%3);
				
				System.out.println("=== End of Arithmetic ======= \n \n");

	}

}
