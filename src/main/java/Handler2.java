import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Handler2 {
    static final List<String> sameFirstAndLustCharacter = new ArrayList<>();

    public static void main(String[] args) {
        String s = "this very good day because i hope we will go to some stunning place";
        String s1 = "abaca abaka abaya aboma abuna aceta adyta aecia afara agama agila agita agora agria aguna ainga ajiva ajuga akela akita alapa aldea aliya aloha alpha alula ameba amiga amnia anana anata anima antra anura aorta apnea araba areca arena arepa aroba aroha aroma asana asura asyla atria ayaya berob blurb caboc ceric ceroc civic codec colic comic conic cosec craiccubic cumec cusec cynic daled dared dated dawed dazed debud decad deked deled dered dewed diced diked dined dited dived doled domed doped dorad dosed doted doved dowed doxed dozed dread dreed dried droid druid dryad duded duked duped dured dyked eagle eagre easle";
        System.out.println(everyFistLetterToUpperCase(s));
        System.out.println("******************************");
        System.out.println(replaceSubstring(s, 4));
        System.out.println(insertWord(s, "ope", "*insertedSubstring*"));
        System.out.println(insertWordAfter(s, 5, "*insertedSubstring*"));
        createCollectionWithSameFirsAndLustCharacter(s1);
        System.out.println(sameFirstAndLustCharacter);
    }

    public static String everyFistLetterToUpperCase(String s) {

        String[] array = s.split("(\\s)");
        StringBuilder sb = new StringBuilder();
        for (String string : array) {
            String firstLetter = string.substring(0, 1);
            String after = string.substring(1);
            sb.append(firstLetter.toUpperCase()).append(after).append(" ");
        }
        return sb.toString();

    }

    public static String replaceSubstring(String inputString, int specifiedLength) {

        String[] array = inputString.split("(\\s)");
        StringBuilder sb = new StringBuilder();
        String subString = inputString.substring(8, 12);
        for (String string : array) {
            if (string.length() != specifiedLength) {
                sb.append(string).append(" ");
            } else {
                sb.append(subString).append(" ");
            }
        }
        return sb.toString();

    }

    public static String insertWord(String inputText, String substring, String specifiedWord) {

        String[] array = inputText.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String string : array) {
            if (string.endsWith(substring)) {
                sb.append(string).append(" ");
                sb.append(specifiedWord).append(" ");
            } else {
                sb.append(string).append(" ");
            }
        }

        return sb.toString();

    }

    public static String insertWordAfter(String inputText, int needLength, String subString) {

        String[] array = inputText.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String string : array) {
            if (string.length() > needLength) {
                sb.append(string, 0, needLength).append(subString).append(string.substring(needLength));
                sb.append(" ");
            } else {
                sb.append(string).append(" ");
            }
        }
        return sb.toString();

    }

    public static void createCollectionWithSameFirsAndLustCharacter(String inputText) {
        String[] array = inputText.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String string : array) {
            if (string.charAt(0) == string.charAt(string.length() - 1)) {
                sameFirstAndLustCharacter.add(string);
            }
        }
    }
}
