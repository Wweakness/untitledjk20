import java.util.Stack;

public class Solution {

   public static int lengthOfLastWord(String s) {
       String[] a=s.split(" ");
       String b=a[a.length-1];
       char[] k=b.toCharArray();
       return k.length;

        /*if(!s.contains(" ")){
            return s.length();
        }
        char[] a=s.toCharArray();
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
                k++;
            }
        }
        int n=0;
        for(int j=k;k>=0;k--){
            for(int i=0;i<a.length;i++){
                if(a[i]==' '){
                   n=i;
                    k--;
                }
            }
        }
        int count=0;
        for(int j=n+1;j<a.length;j++){
            count++;
        }
        return count;*/
        /*Stack stack=new Stack();
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
                stack.push(i);
            }
        }
        int k= (int) stack.pop();
        int count=0;
        for(int j=k+1;j<a.length;j++){
            count++;
        }
        return count;*/

      /*  int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
                b[j]=i;
                j++;
            }
        }
        int k=0;
        int m=0;
        while (b[k]!=0){
            m=b[k];
            k++;
        }

        int count=0;
        for(int d=m;d<a.length;d++){
            count++;
        }
        return count;*/
    }

    public static void main(String[] args) {
        String S="a dsf";
        System.out.println(lengthOfLastWord(S));
    }
}
