/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofnumbersinarray;

/**
 *
 * @author amena
 */
public class SumOfNumbersInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};
       int sum = 0;
       
       for (int element: array) {
           System.out.println(element);
           sum +=element;
       }
       
       System.out.println("Total Array Sum is: " + sum);
    }
    
}
