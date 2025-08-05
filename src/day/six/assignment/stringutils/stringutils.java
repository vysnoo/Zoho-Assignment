package day.six.assignment.stringutils;

public class stringutils {
     public String Concat(String a, String b){
         return a+b;
     }
    public String reverse(String a){
       String res="";
       for(int i=a.length()-1;i>=0;i--){
           res=res + a.charAt(i);
       }
       return res;
    }
    public int length(String str){
         int count =0;
         for(int i=0;i<str.length();i++){
             count++;
         }
         return count;
    }
}
