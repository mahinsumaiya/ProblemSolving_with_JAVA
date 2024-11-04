
import java.util.Arrays;

public class P2_SortingScores {
    public static void main(String[] args) {
        double[] cgpa={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i=0;i<=cgpa.length-1;i++){
            for (int j=i+1;j<=cgpa.length-1;j++){
                if (cgpa[j]>cgpa[i]){
                    double temp=cgpa[j];
                    cgpa[j]=cgpa[i];
                    cgpa[i]=temp;
                }
            }
        }

        System.out.println("After Sorting in descending order,the CGPA scores is:" +Arrays.toString(cgpa));
    }
}
