import java.util.*;
class program2{
   public static void main(String[] args){
      Scanner n=new Scanner(System.in);
      String a=n.nextLine();
      String b=n.nextLine();
      System.out.println(UserMainCode.find(a,b));
}
}

class UserMainCode {
    public static int find(String s1, String s2) {
        int count = 0;
        int len1 = s1.length();
        int len2 = s2.length();

        if (len2 == 0 || len1 == 0 || len2 > len1) {
            return 0;
        }

        for (int i = 0; i <= len1 - len2; i++) {
            String sub = s1.substring(i, i + len2);  
            if (sub.equals(s2)) {                    
                count++;
            }
        }

        return count;
    }
}
