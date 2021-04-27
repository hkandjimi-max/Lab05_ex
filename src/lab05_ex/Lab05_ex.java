/*
1. Create a program that populates an array(2. array create) of size n(1.user prompt(variable)) 
with integer values(3. loop to prompt user) from user input.

2. Your program should further do two arithmetic operations (addition and division) on all the consecutive numbers in the array; e.g., if our array has 1, 2, 3,
4, 5, 6 then your sample solution should be:
sum1 = (1+2), quotient1 = (1/2)
sum2 = (2+3), quotient2 =( 2/3)
etc.
The java implementation for the above task is not that complex.
 */
package lab05_ex;

import java.util.Scanner;

/**
 *
 * @author ckandjimi
 */
public class Lab05_ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the array size: ");
            size = input.nextInt(); 

            // Create array with provided size
            int [] ListOfNumbers = new int[size];

            //loop to prompt user - exact numbers
            for (int i = 0; i < ListOfNumbers.length; i++) {
                System.out.println("Enter value at index "+i+":");
                ListOfNumbers[i] = input.nextInt();      
            }

            // print out values with loop (find-out) -Array toString() method
            for (int i = 0; i < size; i++) {
                System.out.print(ListOfNumbers[i]+"\t");
            }
            // 1 2 0 3 4
            // sum1 = 1+2  q = 1/2
            // sum2 = 2+3  q = 2/3
            //sum1 = array[0]+array[1]
            System.out.println("");
            for (int i = 0; i < size-1; i++) {
                //sumi = array[i]+array[i+1] Q1 = array[i]/array[i+1]
                //System.out.println("I=>"+i+" I+1=>"+(i+1));
                int sum = ListOfNumbers[i]+ListOfNumbers[i+1];
                double Q1 = ListOfNumbers[i]/ListOfNumbers[i+1]; //convert to double
                System.out.println("Sum = "+sum+"\t"+"Quotient ="+Q1);
            }
        }
        catch(NegativeArraySizeException ex){
            System.out.println("Error encountered : Negative index not allowed");
        }
        catch(Exception ex){
            System.out.println("Error encountered :"+ex.toString());
        }
        finally{
            System.out.println("GOOD BYE!!!");
        }
        
    }
    
}
