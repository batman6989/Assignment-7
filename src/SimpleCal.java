
import java.util.Scanner;

import static java.lang.System.*;


public class SimpleCal{
    double result;
    public double doMultiplication(double i, double i1) {
        out.println("******* Entering in Multiplication Process ********");
        out.println("Enter Your Choice :::::::  \n");
        Scanner sr = new Scanner(in);
        out.println("Enter Number 1 For Multiplication: ");

         i = sr.nextDouble();
        out.println("Enter Number 2 For Multiplication: ");
        i1 = sr.nextDouble();

        result = i * i1;

        out.println("Multiplication of " + i + " and " + i1 + " is ::::::: " + result);
        return result;


    }

   public static void main(String[] args) {
       new SimpleCal().doMultiplication(5,3);



    }
    }