/*
- An **add** method that takes in two integer numbers and adds them together the call to that method would look like this: **add(int num1, int num2)**
- A **subtraction** method that takes in two integers and subtracts them from one another would look like this: **subtract( int num1, int num2)**
- A **multiplication** method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
- A **division** method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
- A **square** method that takes in one integer and squares it: square(int num1, int num2)
 */
////////IMPORTS///////////////////////
import java.math.*;
////////MAIN METHOD//////////////////////////////////
public class calculator {
    public static void main(String[] args){
        doMathStuff adds = new add();
        adds.calculate(5, 10);
        doMathStuff subtract = new subtract();
        subtract.calculate(5, 10);
        doMathStuff multiply = new multiply();
        multiply.calculate(5, 10);
        doMathStuff divide = new divide();
        divide.calculate(10, 5);
      //  doMathStuff squared = new thisSquared();
        //squared.calculate(5);
    }
}
//////////////CLASSES/METHODS/ETC..//////////////
 class doMathStuff {
    public  void calculate(int x, int y){
      System.out.println();
    }
}
class add extends doMathStuff {
    public void calculate(int x, int y) {
       
        int math = (x + y);
        System.out.println("doing addition stuff: " + math);
    }
}
class subtract extends doMathStuff{
    public void calculate(int x, int y){
        int math = (x- y);
        System.out.println("subtracting stuff: "+ math);
    }
}
class multiply extends doMathStuff{
    public void calculate(int x, int y){
        int math = (x* y);
        System.out.println("multiplying stuff: "+ math);
    }
}
class divide extends doMathStuff{
    public void calculate(int x, int y){
        int math = (x/y);
        System.out.println("dividing stuff: "+ math);
    }
}
class magicCalculator extends doMathStuff{
    public void calculate (double z){
        System.out.println();
    }
}

class thisSquared{
    public void calculate(double z){
        double math = (Math.sqrt(z));
        System.out.println("squared: "+math);
    }
}

