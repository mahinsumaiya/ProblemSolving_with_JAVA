
import java.util.Arrays;
import java.util.Scanner;

public class P7_2LowestHeightOfBabies {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[] heights= new int[10];

        int FirstLowestHeight=Integer.MAX_VALUE;
        int SecondLowestHeight=Integer.MAX_VALUE;

        System.out.println("Enter heights of 10 babies in cm : ");

        for (int i=0;i<=heights.length-1;i++){
            heights[i]=input.nextInt();
        }


        for(int height:heights){

            if (height<FirstLowestHeight){
                SecondLowestHeight=FirstLowestHeight;
                FirstLowestHeight=height;

            } else if(height<SecondLowestHeight && height!=FirstLowestHeight){

                    SecondLowestHeight=height;
            }

        }
        System.out.println("Array of the babies heights : " +Arrays.toString(heights));
        System.out.println("First Lowest Height baby from the Array:" +FirstLowestHeight);
        System.out.println("Second Lowest Height baby from the Array:" +SecondLowestHeight);


    }
}
