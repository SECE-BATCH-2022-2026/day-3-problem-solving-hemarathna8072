import java.util.*;
import java.util.regex.*;  
class p2{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
	String s=n.nextLine();
	System.out.println(UserMainCode.vowelCount(s));
	    }
}

class UserMainCode {
    public static int vowelCount(String s){
		int c=0;
	for(Character ch:s.toCharArray()){
	  switch(Character.toLowerCase(ch)){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		   c++;
		   break;
		default:
		    break;
}
}
return c;
 
           }
}
