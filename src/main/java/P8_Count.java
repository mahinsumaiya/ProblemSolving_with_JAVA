
public class P8_Count {
    public static void main(String[] args) {
        String mystr = "I am a SQA Engineer";
        String[] words = mystr.split(" ");
        System.out.println("Output:");
        System.out.println("Words:" + words.length);

        char[] ch = mystr.toLowerCase().toCharArray();
        String vowels = "aeiou";
        int chars_count = 0;
        int vowel_count = 0;
        int consonant_count = 0;


        for (char c : ch) {
            if (Character.isLetter(c)) {
                chars_count++;

                if (vowels.contains(String.valueOf(c))) {
                    vowel_count++;
                } else {
                    consonant_count++;
                }

            }
        }

            System.out.println("Chars: " + chars_count);
            System.out.println("Vowels: " + vowel_count);
            System.out.println("Consonant: " + consonant_count);

        }
    }

