import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the graphing calculator program");

        int input;
        Scanner se = new Scanner(System.in);

        System.out.println("Choose the following" + '\n' + "1. Linear" + '\n' + "2. Quadratic" + '\n' + "3. Cubic" +
                '\n' + "4. Sin" + '\n' + "5. Exit");
        input = se.nextInt();
        double a, b, c, startX, endX; //defining variables
        double m, y, startX2, endX2;
        double a3, b3, c3, d3, startX3, endX3;
        double x4, startX4, endX4;


        if (input == 1) {       //if statement for linear function
            System.out.println("For the equation y=ax+b");

            System.out.println("enter the value for a");
            m = se.nextDouble();

            System.out.println("enter the value for b");
            y = se.nextDouble();

            System.out.println("enter the starting value of x");
            startX = se.nextDouble();

            System.out.println("enter the last value of x");
            endX = se.nextDouble();

            System.out.println("X                Y" + '\n' + "------------------");

            for (double x = startX; x <= endX; x++) {   //for loop for printing the table
                double t = ValueOfYLinear(m, y, x);
                System.out.println(x +    "     | " + t);

            }

        } else if (input == 2) {           //else if statement for the quadratic function
            System.out.println("For the equation ax^2 + bx + c");

            System.out.println("enter the value for a");
            a = se.nextDouble();

            System.out.println("enter the value for b");
            b = se.nextDouble();

            System.out.println("enter the value for c");
            c = se.nextDouble();

            System.out.println("enter the starting value of x");
            startX2 = se.nextDouble();

            System.out.println("enter the last value of x");
            endX2 = se.nextDouble();

            System.out.println("X                Y" + '\n' + "------------------");

            for (double x = startX2; x <= endX2; x++) {     //for loop for printing the table
                double t = ValueOfYQuadratic(a, b, c, x);
                System.out.println(x + "     | " + t);
            }


        } else if (input == 3) {                      //else if statement for the cubic function
            System.out.println("For the equation x^3 + bx^2 + cx + d");

            System.out.println("enter the value for a");
            a3 = se.nextDouble();

            System.out.println("enter the value for b");
            b3 = se.nextDouble();

            System.out.println("enter the value for c");
            c3 = se.nextDouble();

            System.out.println("enter the value for d");
            d3 = se.nextDouble();

            System.out.println("enter the starting value of x");
            startX3 = se.nextDouble();

            System.out.println("enter the last value of x");
            endX3 = se.nextDouble();

            System.out.println("X                Y" + '\n' + "------------------");

            for (double x = startX3; x <= endX3; x++) {      //for loop for printing the table
                double t = ValueOfYCubic(a3, b3, c3, d3, x);
                System.out.println(x + "     | " + t);
            }

        }   if (input == 4) {   //if statement for sin(x)
            System.out.println("enter value for x in degrees (will be converted to radians)");
            x4 = se.nextDouble();

            System.out.println("enter the starting value for x");
            startX4 = se.nextDouble();

            System.out.println("enter the starting value for x");
            endX4 = se.nextDouble();

            System.out.println("X                Y" + '\n' + "------------------");

            for (double x = startX4; x <= endX4; x++) {   //for loop for printing the table
                double t = ValueOfYSin(x);
                System.out.println(x + "     | " + t);


            }

        }  if (input == 5) {
            for (int w = 0; w < 20; w++) System.out.println();
        }

    }

    public static double ValueOfYQuadratic(double a, double b, double c, double x2) { //method for calculating y for x

        double y = a * Math.pow(x2, 2) + b * x2 + c;
        return y;
    }

    public static double ValueOfYLinear(double m, double b, double x) { //method for calculating y for x2

        double y = m * x + b;
        return y;

    }

    public static double ValueOfYCubic(double a3, double b3, double c3, double d3, double x3) { //method for
                                                                                                //calculating y for x3

        double y = a3*Math.pow(x3,3) + b3*Math.pow(x3,2) + c3*x3 + d3;
        return y;


    }

    public static double ValueOfYSin(double x) { //method for calculating y for x4

        double y = Math.sin(x*Math.PI/180);
        return y;
    }
}
