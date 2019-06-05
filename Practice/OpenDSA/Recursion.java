import javax.lang.model.util.ElementScanner6;

public class Recursion
{
    public static void main(String[] args)
    {
        int[] arrayOfInts = new int[]{10,25,5,3,120};

        System.out.println("Hello World");
        System.out.println("Largest number in array: " + largest(arrayOfInts,arrayOfInts.length-1));
        System.out.println("Multiple numbers result: " + multiply(2,5));
        System.out.println("GCD of numbers result: " + GCD(50,100));
        System.out.println("Log of numbers result: " + log(2,8));
        System.out.println("Sum to given integer result: " + sumtok(10));
        System.out.println("Sum of all odd numbers less than or equal to given number result: " + addOdd(10));
        System.out.println("Sum of digits given: " + sumOfDigits(1111));
        System.out.println("Number of times A occurs in given string " + countChar("ABCABC"));
        //System.out.println("Is the x integer prime: " + primeNumber(15, 2));
        System.out.println(125/2);
    
    
    }

    /**
     * Finds the largest number in an array of numbers
     * @param numbers
     * @param index
     * @return the largest int in an array of numbers
     */
    public static int largest(int[] numbers, int index)
    {
        if(index == 0)
        {
            return numbers[0];
        }
        return Math.max(numbers[index],largest(numbers,index-1)); 
    }

    /**
     * Takes two numbers x and y and multiples them; Assumes they are both positive integers
     * @param x
     * @param y
     * @return the result of multipling x and y
     */
    public static int multiply(int x, int y)
    {
        if(x == 0)
        {
            return 0;
        }
        else
        {
            return  multiply(x-1,y) + y;
        }
    }

    /**
     * Calculates the greatest common denominator of int x and int y
     * @param x
     * @param y
     * @return the gcd of x and y
     */
    public static int GCD(int x, int y)
    {
        if(y == 0)
        {
            return x;
        }
        else
        {
            return GCD(y, x%y);
        }
    }

    /**
     * This function computes the log of n to the base b
     * Example: log 8 to base 2 equals 3 since 8 = 2*2*2; We can find this by dividing 8 by 2 until we reach 1
     * and we cound the number of divisions we make; Assume n is exactly b to some integer power
     * @param b
     * @param n
     * @return
     */
    public static int log(int b, int n )
    {
        if(n <=b)
        {
            return 1;
        }
        else
        {
            return log(b,n/b)+1;
        }
    }

    /**
     * This function returns the sum of the values from 1 to k
     * @param k
     * @return
     */
    public static int sumtok(int k)
    {
        if(k<=0)
        {
            return 0;
        }
        else
        {
            return k + sumtok(k-1);
        }
    }

    /**
     * Should return the sum of all positive odd numbers less than oor equal to n
     * @param n
     * @return
     */
    public static int addOdd(int n)
    {
        if( n <= 0)
        {
            return 0;
        }
        if(n%2 !=0)
        {
            //an odd number has been found
            return n + addOdd(n-1);
        }
        else
        {
            //an even number has been found
            return addOdd(n-1);
        }
    }

    /**
     * Takes a non-negative integer and returns the sum of its digits
     * @param number
     * @return
     */
    public static int sumOfDigits(int number)
    {
        if(number<10)
        {
            return number;
        }
        return number %10 + sumOfDigits(number/10);
    }

    /**
     * Counts the number of times 'A' appears in a string
     * @param str
     * @return
     */
    public static int countChar(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }
        int count = 0;
        if(str.substring(0,1).equals("A"))
        {
            count = 1;
        }

        return count + countChar(str.substring(1,str.length()));
    }

    public static boolean primeNumber(int x, int y)
    {
        if(y == 1)
        {
            return true;
        }
        else if (x % y == 0)
        {
            return false;
        }
        else 
        {
            return prime(x,y-1);
        }
    }
}