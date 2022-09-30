import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
//Creating a Pattern through Regular Expression
        String regex1 = "Sca(nn|mm)er";
//String to be compared with RegEx
        String regex2 = "Scammer";
        String regex3 = "[A-Z]";
        String regex4 = "A";
       // String regex3 = "[A-Z]";


//Pattern Matching done using matches() method
        System.out.println(regex2.matches(regex1));
        System.out.println(regex3.matches(regex4));
//Pattern Matching done using Pattern.matches() method
        System.out.println(Pattern.matches(regex1, regex2));
    }
}
