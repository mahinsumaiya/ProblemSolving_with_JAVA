
import java.util.Scanner;

public class P4_MaxMinFromRandomArray {
    public static void main(String[] args) {
        Scanner inputArray = new Scanner(System.in);
        int[] number = new int[10];

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        System.out.println("Enter 10 integer numbers : ");

        for (int i=0;i<=number.length-1;i++){
            number[i]= inputArray.nextInt();
        }


        for(int i=0;i<=number.length-1;i++){
            if(max<number[i]){
                max=number[i];
            }
            if(min>number[i]){
                min=number[i];
            }
        }
        System.out.println("Maximum Number is: " +max);
        System.out.println("Minimum Number is: " +min);
    }
}


