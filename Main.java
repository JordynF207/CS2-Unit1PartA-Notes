import java.util.Scanner;
//Import statements always go at the begninning of the code

public class Main {
/* 
This is my comment space! 

*/
   public static void main(String []args) {
      System.out.println("It makes no sense to divide a number by zero!");
      System.out.println(0/3);

      // We can use println or print to produce output 
      System.out.print("Hi ");
      System.out.print("there");
      System.out.println("!");

      // We cna print special characters using an esapce sequence \
   
      System.out.println("\"");
      System.out.println("\\");
      System.out.println("I love computer science.\nIt is so cool.");

      System.out.println("I'm excited to get lunch.\n I am very hungry.\n It is hard for me to focus in class. \n I want to hang out with friends");


      // Math operators + - * /
      // When we do int division, it truncates our answer. It returns an int.

      int x = 5;
      int y = 3;
      
      System.out.println(x/y); 

      // % gives us the remainder
      System.out.println(x%y);

      x = 6;
      y = x;
      x = 8;

      // We can also update variable assignments by incrementing and decrementing
      // Incrementing adds 1 to our value 
      // Decrementing subtracts 1 from out value 

      x = x + 1;
      // x++ updates our variable even without the equal sign
      x++;
      x = x - 1;
      // x-- updates our varibale even without the equal sign 
      x--;


      /*
      System.out.println("Please type in a name in the input box below.");
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      System.out.println("Hello " + name);
      scan.close();
      */

      // Lesson 1.5 Casting
      // We can cast to change data types for variables we already have defined
      int intNum = 4;
      // We cast by including new data type in () before our variable
      System.out.println((double) intNum);
      System.out.println(intNum);

      double dbNum = 4.6;
      System.out.println((int) dbNum);

      double negNum = -3.4;
      // When we cast doubles to int, it truncates our decimal. It does not round
      // WE cna round manually using math
      // WE can round positive numbers by adding .5 and casting
      int roundedPos = (int)(dbNum + .5);
      System.out.println(roundedPos);

      // We can round negative numbers by subtracting .5 and casting
      int roundedNeg = (int)(negNum - .5);
      System.out.println(roundedNeg); 

     
      //Coding challenge

      int grade1 = 94;
      int grade2 = 85;
      int grade3 = 89;
      int sum;
      double average;
      sum = grade1 + grade2 + grade3;
      average = (double) sum / 3;
      System.out.println(average); 

   

   }

}
