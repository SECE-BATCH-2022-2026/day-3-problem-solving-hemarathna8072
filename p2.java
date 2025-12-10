import java.util.*;
import java.util.regex.*;  
class p2{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
	String s=n.nextLine();
	char ch=n.nextLine().charAt(0);
	 System.out.println(Arrays.toString(UserMainCode.splitString(s, ch)));
    }
}

class UserMainCode {
    public static String[] splitString(String s,char ch){
	String[] inp=s.split(""+ch);
	String[] op=new String[inp.length];
	int i=0;
	for(String c:inp){
	    op[i++] = new StringBuilder(c)
                        .reverse()
                        .toString()
                        .toLowerCase();
}
	return op;
	
           }
}
