
public class Main {
  public static void main(String[] args) {

    import java.util.*;

class Main {
	
	public static void main(String args[]) {
		// Your code goes here
		// System.out.print(10);
		// System.out.print("Hello World");
		// System.out.println("Hello");
		// System.out.print("World");
		
		// 1. Variables
		// 1.1 int
		// int x;
		// x = 10;
		// int x = 10;
		// System.out.println(x);
		// System.out.println("Number is " + x);
		
		// 1.2 long
		// long l;
		// l = 1000000000000l;
		// l = 1000000000000L;
		// long l = 1000000000000L;
		// System.out.println(l);
		// System.out.println("Number is " + l);
		
		// 1.3 float
		// float f = 1.234f;
		// System.out.println(f);
		// System.out.println("Number is " + f);
		
		// 1.4 double
		// double d = 1.234d;
		// System.out.println(d);
		// System.out.println("Number is " + d);
		
		// 1.5 boolean
		// boolean b1 = true;
		// boolean b2 = false;
		// System.out.println(b1);
		// System.out.println(b2);
		
		// 1.6 String -> case sensitive -> capital S is required
		// String s1 = "Shreesh";
		// String s2 = "Tripathi";
		// System.out.println(s1);
		// System.out.println(s2);
		// System.out.println("My Name is " + s1 + " " + s2);
		
		
		// 2. Typecasting
		// int i1 = 123;
		// int i2 = 2345;
		// widening typecasting -> automatically perform
		// long l1 = i1;
		// i2 = (int)l1;
		
		
		// long l2 = 1000000000000L;
		// i2 = (int)l2;
		
		// System.out.println(l1);
		// System.out.println(l2);
		// System.out.println(i2);

		// float f = 1.234f;
		// double d = f;
		// double d = 1.2345;
		// float f = (float)d;
		
		// System.out.println("Float : " + f);
		// System.out.println("Double : " + d);
		
		// float f = 12.34f;
		// double d = 12.6;
		// int i = (int)f;
		// int i = (int)d;
		// long l = (long)d;
		// System.out.println(d);
		// System.out.println(l);

		// 8 Primitive data types : 
		// 1. byte  2. short 3. int 4.long  
		// 5. float 6. double 7. boolean 8. char
		
		
		// 3. How to take input from user
		Scanner scn = new Scanner(System.in);
		// int
		// int i;
		// i = scn.nextInt();
		
		// int i2 = scn.nextInt();
		// System.out.println("Number is : " + i2);
		
		// long
		// long l;
		// l = scn.nextLong();
		// System.out.println("Long number is : " + l);
		
		// long l1 = scn.nextLong();
		// long l2 = scn.nextLong();
		// System.out.println(l1 + " " + l2);
		
		// float
		// float f = scn.nextFloat();
		// System.out.println(f);
		
		
		// double
		// double d = scn.nextDouble();
		// System.out.println(d);
		
		// boolean 
		// boolean b = scn.nextBoolean();
		// System.out.println(b);
		
		// string
		
		// next() -> consider text untill space Or newline is not encounter
		// String str1 = scn.next();
		// String str2 = scn.next();
		// System.out.println(str1);
		// System.out.println(str2);
		
		// String str1 = scn.nextLine();
		// String str1 = scn.next();
		// String str2 = scn.nextLine();
		// String str3 = scn.nextLine();
		// System.out.println(str1);
		// System.out.println(str2); // empty string
		// System.out.println(str3);
		
		
		
		// Problem 1 : Ask for name and age of user and print it;
		// String name = scn.next();
		// int age = scn.nextInt();
		// System.out.println(name + "'s age is " + age);
		
		
		// Problem 2 : Ask for A string and B String and print A loves B.
		// String A = scn.next();
		// String B = scn.next();
		
		// System.out.println(A + " loves " + B);
		
		
		// doubt session
		// String str = scn.next();
		// System.out.println(str);
		
		
		String str1 = scn.nextLine();
		String str2 = scn.nextLine();
		
		System.out.println(str1); // Hello
		System.out.println(str2); // empty string
		System.out.println("Cool");
		
		
	}
}

      System.out.println("Hello, World!");
      System.out.println("Hello World !"); 

      problems

       System.out.println("Hello");
        System.out.println("World !");

        System.out.println("Hello");
        System.out.println("");
        System.out.println("World !");

         System.out.println("Hello 40");
        System.out.println("50 World !");

    System.out.println("*****");
    System.out.println("****");
    System.out.println("***");
    System.out.println("**");
    System.out.println("*");

      System.out.println("    *");
       System.out.println("   **");
       System.out.println("  ***");
       System.out.println(" ****");
       System.out.println("*****");

       System.out.println(6+3);
        System.out.println(6-3);
        System.out.println(6*3);
        System.out.println(6/3f);

        Scanner s = new Scanner(System.in);
        String m = s.next();
        String n = s.next();
        System.out.println(m  +" says Hi to "+n);

         System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        System.out.print((A+B) + " ");
        System.out.print((A*B) + " ");
        System.out.print((A-B) + " ");
        System.out.print(A/B);

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        System.out.print(A +""+B );


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n+10);

        Scanner s = new Scanner(System.in);
        String m = s.next();
        System.out.println("Hello "+m);

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        System.out.println(n*m);


        Scanner s = new Scanner(System.in);
        float n = s.nextFloat();
        int m = s.nextInt();
        int a = (int) n/m;
        System.out.println(a);

        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        String C = s.next();
        String D = s.next();
        System.out.println(A+" "+B+" "+C+" "+D);

         Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       System.out.println(40-n);

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(N*2);

         Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        System.out.print(N*2+M );






        
  }
}