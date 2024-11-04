
import java.util.LinkedHashMap;

public class P9_OccuranceOfCharacters {
    public static void main(String[] args) {

        String mystr="I live in Dhaka";
        char[] ch=mystr.toLowerCase().toCharArray();

        LinkedHashMap<Character,Integer>hashMap=new LinkedHashMap<>();

        for (char c:ch) {
            if (c != ' ') {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("Number of Occurance of characters:");
        for (char c: hashMap.keySet()){
            System.out.println(c+ " "+hashMap.get(c));
        }

    }
}
