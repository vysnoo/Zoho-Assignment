package day.eight.assignment;

// Save this program to local .java file in the folder and run with cmd
// It doesnt work in IDE so use local file and run with command line interface
// javac StringArrayExample.java
// java StringArrayExample Hello World Java Programming
public class CommandLineStrings {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No strings entered");
        }

        String[] strs = args;

        for(String s: strs){
            System.out.println(s);
        }
    }
}
