package com.company;

public class Main
{
    static int factorial(int n)
    {
        if (n < 10)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args)
    {
        int result = factorial(10);
        System.out.println("10! = " + result);
    }
}


package com.company;

public class Main {

    public static void main(String[] args)
    {
        hello(10);
    }
    public static void hello(int count)
    {

        System.out.println("Hello!");

        if (count == 4)
        {
            return;
        }
        hello(count - 1);


    }
}


package com.company;

public class Main {

    public static void main(String[] args)
    {
        // method to recursively call the method a finite number of times
        check_greeting(10);
    }
    public static void check_greeting(int count)
    {
        
        // condition if the method has recursively called itself a certain number of times
        if (count == 0)
        {
            // if count has reached the maximum count number, then print out the message
            System.out.println("Finished!");
        }
        else
        {
            // test for the count number even or odd?
            if (count % 2 == 0)
            {
                // if it is even print this message
                System.out.println("Good Evening!");
            }
            else
            {
                // if it is odd print out this message
                System.out.println("Good Morning");
            }
            // recursion call parameter is decremented by one
            check_greeting(count - 1);

        }

    }
}
