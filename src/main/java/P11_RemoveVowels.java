
public class P11_RemoveVowels {
    public static void main(String[] args) {

        String mystr="I am a SQA Engineer";
        String vowels="aeiou";

        char[] ch=mystr.toLowerCase().toCharArray();
        StringBuilder output=new StringBuilder();

        for (char c:ch){
            if(!vowels.contains(String.valueOf(c))){
                    output.append(c);
                }
            }
            System.out.println("Output:" +output);
        }
}

