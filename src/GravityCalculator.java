/*
* created vy Mohamed Khalefa
*
* MIT open course ware
* introduction to programming in Java
*In this assignment, i will create a program that computes the distance an object will fall in Earth's gravity.
1
* */

public class GravityCalculator {
    public static void main (String [] args){
// calculating the actual result
        double initialVelocity = 0.0;  //Vi
        double initialPosition = 0.0;  //Xi
        double Acceleration = -9.81 ;  // earth's gravity
        double time = 10 ;             // falling time
        double Xt = 0.5 *(Acceleration *(time*time)) + initialVelocity +initialPosition ; // Xt = 0.5*at^2 +Vi +Xi
        // final output
        System.out.println("The object position after " + time +" Seconds is "+ Xt +" M");

    }

}

