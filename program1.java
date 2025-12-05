import java.util.*;
class program1{
  public static void main(String[] args){
      Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      int b=n.nextInt();
      int c=n.nextInt();
      int tot=Class2.find(a,b,c);
      System.out.println(tot);
 }
}

class Class2{
 public static int find(int a,int b,int c){

    if(a==13){
        if(c==13)
            return 0;
        else
            return c;
    }
    else if(b==13){
        if(a==13)
            return 0;
        else
            return a;
    }
    else if(c==13){
        if(a==13){
            if(b==13){
                return 0;
            }
            else{
                return b;
            }
        }
        else{
            if(b==13)
                return a;
            else
                return a+b;
        }
    }
    else{
        return a+b+c;
    }

 }
} 
