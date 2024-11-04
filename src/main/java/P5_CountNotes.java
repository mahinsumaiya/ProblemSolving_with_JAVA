
public class P5_CountNotes {
    public static void main(String[] args) {
        int[] notes={1000,500,200,100,50,20,10,5,2,1};
        int amount=546;

        System.out.println("Input: "+amount);

        for (int value:notes){
            if(amount>=value){
                int count=amount/value;
                amount%=value;
                System.out.println(value+" "+count);
            }
        }
    }
}
