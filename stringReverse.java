import java.util.Scanner;
public class stringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Type a word: ");
        
        word = sc.nextLine();
        sc.close();
        String rev = revStr(word);
        System.out.println("The reversal of the word: " + rev);
    }

    public static String revStr(String str)
    {
        if (str.isEmpty()) {return str;}

        return revStr(str.substring(1)) + str.charAt(0);
    }
}

