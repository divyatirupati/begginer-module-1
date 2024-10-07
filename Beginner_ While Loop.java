import java.util.*;

class Main {
	public static void main(String args[]) {	
		Scanner scn = new Scanner(System.in);
		/*
		Q1 Print numbers from 1 to 10.
		-> 1 2 3 4 5 6 7 8 9 10
		*/
		// int i = 1;
		// while(i <= 10) {
		// 	System.out.println(i);
		// 	i = i + 1;
		// }
		
		/*
		Q2 Print numbers from 1 to N.
		N = 7
		-> 1 2 3 4 5 6 7
		*/
		// int N = scn.nextInt();
		// int i = 1;
		// while(i <= N) {
		// 	System.out.println(i);
		// 	i = i + 1;
		// }
		
		/*
		Q3 Print odd numbers from 1 to N.
		Ex: N = 10 
		-> 1 3 5 7 9
		*/
		// int N = scn.nextInt();
		
		// method - 1
		// int i = 1;
		// while(i <= N) {
		// 	if(i % 2 != 0) {
		// 		// i  is ODD
		// 		System.out.println(i);
		// 	}
		// 	i = i + 1;
		// }
		
		// method - 2 -> efficient way
		// int i = 1;
		// while(i <= N) {
		// 	System.out.println(i);
		// 	i = i + 2;
		// }
		
		/*
		Q4 Print even numbers from 1 to N.
		Ex: N = 10 
		-> 2 4 6 8 10
		*/
		// int N = scn.nextInt();
		// method - 1
		// int i = 1;
		// while(i <= N) {
		// 	if(i % 2 == 0) {
		// 		System.out.println(i);
		// 	}
		// 	i = i + 1;
		// }
		
		// method - 2
		// int i = 2;
		// while(i <= N) {
		// 	System.out.println(i);
		// 	i = i + 2;
		// }
		
		/*
		Q5 Print all numbers from N to 1.
		Ex: N = 10 
		-> 10 9 8 7 6 5 4 3 2 1
		*/
		// int N = scn.nextInt();
		// while(N >= 1) {
		// 	System.out.println(N);
		// 	N = N - 1;
		// }
		
		// number = 12; 12 * i - > multiple
		// 24 , 36, 48, 120 -> multiple of 12
		// 3, 2, 6, 4 -> factor of 12
		
		/*
        Q6 Print numbers from 1 to N which are multiple of 4.
        Ex: N = 50 
        -> 4 8 12 16 20 24 28 32 36 40 44 48
        */
		// int N = scn.nextInt();
		// method - 1
		// int i = 1;
		// while(i <= N) {
		// 	if(i % 4 == 0) {
		// 		System.out.println(i);
		// 	}
		// 	i = i + 1;
		// }
		
		// method - 2
		// int i = 4;
		// while(i <= N) {
		// 	System.out.println(i);
		// 	i = i + 4;
		// }
		
		// method - 3
		// int i = 1;
		// while(4 * i <= N) {
		// 	System.out.println(4 * i);
		// 	i = i + 1;
		// }
		
		// i = 1	4*i = 4
		// i = 2	4*i = 8
		// i = 3	4*i = 12
		// i = 4   4*i = 16
		// .
		// .
		// i = 12 	4*i = 48
		// i = 13  4*i = 52 -> conditionwise it is false
		
		
		/*
		Q7 Print numbers from 1 to N, which are perfect Square.
		N = 100
		-> 1 4 9 16 25 36 49 64 81 100
		if sqrt(num) is an integral number than that number is perfect sq.
		*/
		// num = i * i 
		// 1 = 1 * 1
		// 4 = 2 * 2
		// 9 = 3 * 3
		// 16 = 4 * 4
		// 25 = 5 * 5
		// 36 = 6 * 6
		// 49 = 7 * 7
		// 64 = 8 * 8
		// 81 = 9 * 9
		// 100 = 10 * 10
		// 	= 11 * 11 => 121
		
		// i <= sqrt(N)
		// i * i <= N 
		
		
		
		// int N = scn.nextInt();
		// int i = 1;
		
		// while(i * i <= N) {
		// 	System.out.println(i * i);
		// 	i = i + 1;
		// }
		
		
		// int a = 10;
		// int b = 13;
		// int c = 12;
		
		// if(a > b && a > c) {
		// 	SOP(a);
		// } else if(b > a && b > c) {
		// 	SOP(b);
		// } else if(c > a && c > b) {
		// 	SOP(c);
		// }
	
		// if(a > b && a > c) {
		// 	SOP(a);
		// } else if(b > c) {
		// 	SOP(b);
		// } else {
		// 	SOP(c);
		// }
		
		// int max = Integer.MAX(a, Integer.MAX(b, c));
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.print(sum);

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        while(i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
       while(n>=1){
           System.out.print(n+" ");
           n--;
       }

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
         int sum = 0;
        for(int i = 1;  i<= A ; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.print(sum);

        Scanner s = new Scanner(System.in);
         int A = s.nextInt();
         int B = s.nextInt();
         int sum = 1;
        for (int i = 1; i <= B;i++){
            sum *= A;
           // System.out.print(sum);
        }
        
        System.out.print(sum);

       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println("5 * "+i+" = "+ N*i);
            i++;
        }

         Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        
        int sum = 0;
        for(int i = 1 ; i <= A ; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.print(sum);

        Scanner s = new Scanner(System.in);
        int A =s.nextInt();
        int i=1;
        while(i*i<=A){
            System.out.print(i*i+" ");
            i++;
        }

        
    


        


	
	}
}