package basicjava;
// package is container of classes

import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
//write your code
        System.out.println("helloword");
/*variable- in java variable are container which store values
    like   String,int,flote,double etc.
    STRING- text msg
    INT -number
    FLOTE -point number
    CHAR - alphabet
    boolean - true or false
  #  how to declare variable ?
         syntax - <datatype> <variablename> = <value>;
  */
        String book = "Esha";
        String place = "Dhenkanal";
       // System.out.println(book);
        System.out.println(book.length());
        
        System.out.println(book + "from" + place);
 /*
         //we can number of variable in one line
   # Rules for constracting name of variable in java
     1. can contain digits,underscore,letter,dollar sign,name should begin with a letter,$.
     2. java is a case sensitive language  like/which means that in java sandhya and Sandhya are two different
      variable altogether
     3.should not contain whitespace.
     4.you can not use reserved keywards from java. .

*/
     String name = "sandhya";
        System.out.println(name);
        int a = 21;
        float b = 21.11f;
        boolean ispresent = true;
           System.out.println(a);
            System.out.println(b);
             System.out.println(ispresent);
  /*     data type:-there are two type of data type
             1 - primitive :-byte(1 byte= -128 to 127), short(2 byte) ,int(4 byte), long(8 byte), float(4 byte)
                   double(8 byte) ,boolean(i bit) ,char (2 byte).
             2 - nonprimitive and referance data type:-
  */
         byte u = 100;
         double d = 234.986d;
        System.out.println(d);
        System.out.println(u);
        char grade = 'A';
        System.out.println(grade);
 /*  Operator in java
          Operand , Operarion , Operand = result
          4             +           6   =  10
          Types of operator in java
              1- Arithmetic Operator
              2- Assignment Operator
              3- Logical Operator
              4- Comparision Operator
 */
        //Arithmetic Operation
        //Explore these operator :- *= , /* , %=
       int num1 = 45, num2=45;
        System.out.println(" the value of num1 + num2 is ");
        System.out.println(num1 + num2);

        System.out.print(" the value of num1 - num2 is ");
        System.out.print(num1 - num2);

        System.out.println(" the value of num1 * num2 is ");
        System.out.println(num1 * num2);

        System.out.println(" the value of num1 / num2 is ");
        System.out.println(num1 / num2);

        System.out.println(" the value of num1 % num2 is ");
        System.out.println(num1 % num2);
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(--num1);
     //Assignment operator
       int num3 = 25; num3 +=44;
        System.out.println("the value of num3 is " );
        System.out.println(num3 );
     /*Comparision operator
        1- ==(check for equality of the two value)
        2- !=(check wheather two value are not equal)
        3- <
        4- >
        5- <=
        6- >=
        //Logical operator
          &&-logical and operator  (return to only if conditions are true )
          ||-Logical or operator (return true if any one condition is true)
          ! - logical not  (Reverse the result from true to false and vice versa)
     */
        //taking user input of the java which is scanner
        Scanner scan = new Scanner(System.in);
        System.out.println( " enter age ");
      //  String input = scan.nextLine();
      //  String input = scan.next();
        int input = scan.nextInt();
        System.out.println(input);
     /*important method of string :-

      */














    }
}
