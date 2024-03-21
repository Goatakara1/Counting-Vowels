import java.util.Scanner;

public class Countingvowels {
    public static void main(String[] args) {

        char vowel;
        int totalvowel = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence : ");

        String sentence = scanner.nextLine();

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            vowel = sentence.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o') totalvowel++;

        }

        System.out.println("The number of vowels in this text is " + totalvowel);

    }
}
