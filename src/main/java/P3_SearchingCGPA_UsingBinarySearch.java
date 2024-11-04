
import java.util.Arrays;
import java.util.Scanner;

public class P3_SearchingCGPA_UsingBinarySearch {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);

        Scanner input = new Scanner(System.in);
        System.out.println("Input CGPA: ");
        double user_cgpa =input.nextDouble();

        double output=binarySearch(cgpa,user_cgpa);

        if (output != -1) {
            System.out.println(user_cgpa + " CGPA is exist in the array");
        } else {
            System.out.println("CGPA doesn't exist in the array");
        }
    }


    public static double binarySearch(double[] arr, double data){
        double left=0;
        double right=arr.length-1;

        while(left<=right){
            double midPosition=(left+right)/2;
            double midNumber=arr[(int) midPosition];

            if(data==midNumber){
                return midPosition;
            }
            if(data>midNumber){
                left=midPosition+1;
            }
            else{
                right=midPosition-1;
            }
        }
        return -1;
    }
}
