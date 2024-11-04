
import java.util.LinkedHashSet;

public class P10_RemoveDuplicate {
    public static void main(String[] args) {
        int[] numbers={1,1,2,3,1,2,4,5,6,5,4,7};

        LinkedHashSet<Integer>hashSet=new LinkedHashSet<>();
        LinkedHashSet<Integer>newHashSet=new LinkedHashSet<>();
        for (int arr:numbers){
            if (!hashSet.add(arr)){
                newHashSet.add(arr);
            }
        }

        hashSet.removeAll(newHashSet);
        System.out.println("Output: " +hashSet);

    }
}
