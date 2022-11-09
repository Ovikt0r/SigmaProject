import java.util.Arrays;

public class Handler2 {

    public static void main(String[] args) {
        String s = "this very good day because i hope we will win";
        System.out.println(everyFistLetterToUpperCase(s));
        System.out.println("******************************");
        System.out.println(replaceSubstring(s, 4));
    }
    public static String everyFistLetterToUpperCase(String s) {

        String [] array = s.split("(\\s)");
        StringBuilder sb = new StringBuilder();
        for (String string: array) {
            String firstLetter = string.substring(0,1);
            String after = string.substring(1);
            sb.append(firstLetter.toUpperCase()).append(after).append(" ");
        }
        return sb.toString();

    }

    public static String replaceSubstring(String inputString, int specifiedLength) {

        String [] array = inputString.split("(\\s)");
        StringBuilder sb = new StringBuilder();
        String subString = inputString.substring(8,12);
        for (String string: array) {
            if(string.length()!=specifiedLength) {
                sb.append(string).append(" ");
            }
            else {sb.append(subString).append(" ");}
        }
        return sb.toString();

    }
}
