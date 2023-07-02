package June05;

import java.util.Arrays;

public class Day06 {
    public String reversed(String num){
        int n = Integer.parseInt(num);
        if (n < 0){
            n = 0 - n;
        }
        if(n == 0){
            return num;
        }
        int rem = 0;
        String res = "";
        while(n != 0){
            rem = n%10;
            res += rem;
            n = n/10;
        }
        return res;
    }

    public String ageStage(int age){
        if (age >= 13 && age <= 19)
            return "teen";
        else if(age < 13)
            return "kid";
        else if(age > 19)
            return "adult";
        else
            return "Invalid Age";
    }

    public void fibonacci(int nTerm){
        int[] fib = new int[nTerm];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < nTerm; i++)
            fib[i] = fib[i-1] + fib[i-2];
        System.out.println(Arrays.toString(fib));
    }

    public void fizzBuzz(){
        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0)
                System.out.print("FizzBuzz ");
            else if(i % 3 == 0)
                System.out.print("Fizz ");
            else if (i % 5 == 0)
                System.out.print("Buzz ");
            else
                System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        Day06 o1 = new Day06();
        System.out.println("Reverse the Integer");
        System.out.println(o1.reversed("000"));
        System.out.println(o1.reversed("100"));
        System.out.println(o1.reversed("123"));

        System.out.println("\n\nAge Category");
        System.out.println(o1.ageStage(16));
        System.out.println(o1.ageStage(22));
        System.out.println(o1.ageStage(-36));
        System.out.println(o1.ageStage(5));

        System.out.println("\n\nFibonacci Series");
        o1.fibonacci(10);

        System.out.println("\n\nFizzBuzz");
        o1.fizzBuzz();
    }

}
