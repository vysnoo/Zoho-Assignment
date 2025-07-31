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
    public MyString substring(int start, int end){
        char[] substring = new char[end-start];
        int idx=0;
        for(int i=start;i<end;i++){
            substring[idx++]=ch[i];
        }
        return new MyString(substring);
    }
    public MyString concat(MyString other){
        char[] concat = new char[ch.length+other.length()];
        int temp=0;
        for(int i=0;i<concat.length;i++){
            if(i<ch.length) {
                concat[i] = ch[i];
            }
            if(i>=ch.length){
                concat[i]=other.charAt(temp++);
            }
        }
        return new MyString(concat);
    }
    public boolean contains(MyString sub){

        if (sub.length() == 0 || sub.length() > this.length()) return false;

        for (int i = 0; i <= this.length() - sub.length(); i++) {
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (this.ch[i + j] != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;

    }

    public  int indexOf(char ch){
        for(int i=0;i<this.ch.length;i++){
            if(this.ch[i]==ch){
                return i;
            }
        }
        return -1;
    }

    public MyString replace(char oldChar, char newChar){
        char[] replaced = new char[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]==oldChar){
                replaced[i] = newChar;
            }else{
                replaced[i]= ch[i];
            }
        }
        return new MyString(replaced);
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
        System.out.println(str.substring(0,str.length()-1));
        System.out.println(str.concat(new MyString("Vishnu")));
        System.out.println(new MyString("ey"));
        System.out.println(str.indexOf('e'));
        System.out.println(str.replace('H','W'));

    }
}
