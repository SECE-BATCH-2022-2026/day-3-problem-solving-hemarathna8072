import java.util.*;
import java.util.regex.*;   // <-- needed for Pattern and Matcher

class p1 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        String s = n.nextLine();
        System.out.println(UserMainCode.regularExpression(s));
        n.close();
    }
}

class UserMainCode {
    public static Boolean regularExpression(String s){
        // Pattern & Matcher are from java.util.regex
        Pattern p = Pattern.compile("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
        Matcher m = p.matcher(s);
        return m.matches();   // true if whole string matches the pattern
    }
}
