import java.util.*;

public class MorseCode {
    public static void main(String[] args) {
        char[] English = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        String[] Morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|"};

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite \"MC\" za prijevod morse na engleski, ili \"Tx\" za prijevod teksta u mose code");
        String a = input.nextLine();
        if (a.equalsIgnoreCase("MC")) {
            System.out.println("Unesite morse kod na način da razdvojite svako slovo razmakom.Za kraj riječi, unesite |");
            String b = input.nextLine();
            String[] words = null;
            if (b.contains("|")) {
                words = b.split("[|]");
            } else {
                words = new String[1];
                words[0] = b;
            }

            for (String word : words) {
                String[] characters = word.split(" ");
                for (int h = 0; h < characters.length; h++) {
                    for (int i = 0; i < Morse.length; i++) {
                        if (characters[h].equals(Morse[i])) {
                            System.out.print(English[i]);
                        }
                    }
                }
                System.out.print(" ");
            }
        } else if (a.contains("Tx")) {
            System.out.println("Unesite slova i svako slovo razmaknite.");
            String c = input.nextLine();

            c = c.toLowerCase();

            for (int x = 0; x < c.length(); x++) {
                for (int y = 0; y < English.length; y++) {
                    if (English[y] == c.charAt(x))

                        System.out.print(Morse[y] + " ");


                }

            }


        } else {
            System.out.println("Unos nije ispravan");

        }

    }
}
// preuzeto sa stackoverflow-a//