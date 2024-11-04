
public class P1_SecondHighestCgpa {
    public static void main(String[] args) {

        double [] cgpa={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double HighestCgpa=cgpa[0];
        double SecondHighestCgpa=cgpa[0];

        for (int i=0;i<=cgpa.length-1;i++){
            if (cgpa[i]>HighestCgpa){
                SecondHighestCgpa=HighestCgpa;
                HighestCgpa=cgpa[i];
            }
            else if (cgpa[i]>SecondHighestCgpa){
                SecondHighestCgpa=cgpa[i];
            }
        }

        System.out.println("Second Highest CGPA is : " +SecondHighestCgpa);

    }
}
