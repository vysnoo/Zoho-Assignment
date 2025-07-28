package day.three.assignment;

public class MyString {

    private char[] ch;

    MyString(String s){
        ch = new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
    }

    MyString(char[] ch){
        this.ch= new char[ch.length];
        for(int i=0;i<ch.length;i++){
            this.ch[i]=ch[i];
        }
    }

    public int length(){
        return ch.length;
    }

    public char charAt(int index){
        if (index < 0 || index >= ch.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return ch[index];
    }
    public boolean equals(MyString other){
        if(other.length()!=ch.length){
            return false;
        }

        for(int i=0;i<other.length();i++){
           if(ch[i]!=other.charAt(i)){
               return false;
           }
        }
        return true;
    }
    public MyString toUpperCase(){
        char[] upper = new char[ch.length];
        for(int i=0;i<ch.length;i++){
         if(ch[i]>='a' && ch[i]<='z'){
             upper[i]=(char)(ch[i]-'a'+'A');
         }else{
             upper[i]=ch[i];
         }
        }
        return new MyString(upper);
    }

    public MyString toLowercase(){
        char[] lower = new char[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                lower[i]=(char)(ch[i]-'A'+'a');
            }else{
                lower[i]=ch[i];
            }
        }
        return new MyString(lower);
    }
    @Override
    public String toString() {
        return new String(ch);
    }

    public static void main(String[] args) {
        MyString str = new MyString("Hey");

        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.equals(new MyString("Hey")));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowercase());

    }
}
