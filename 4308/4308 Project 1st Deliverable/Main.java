import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Main
{
    public static void main(String args[])throws FileNotFoundException {

        String entireFileText = new Scanner(new File("sclex1.txt")).useDelimiter("\\A").next();
        // take the file that we need and convert it to a string.
        String[] SplitArray = entireFileText.split("\\s+");
        // printing out all the information that was from the file and seperated by the tokenizer.
        for (int i = 0; i < SplitArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(SplitArray[i]);
        }
        // What we have as of right now eliminating the white space.
        // So we do not need to process single characters at a time since we have eliminated the white space and already have full words for our code.
        // We can just take each string in our array and compare them to tokens to get indentities.
        System.out.println();
        int length = SplitArray.length;
        System.out.println(length);
        // The array length , the amount of words in the array that we need to process.
        ArrayList<String> TokenList = new ArrayList<String>();
        // The array where we are going to store all of our tokens
        for (int start=0; start < length; start++){
            // Using a for loop to take each string out of the array one by one and compare it to our if statements
            String a = SplitArray[start];
            if (a.equals("=")){
                TokenList.add("ASSIGNMENT_OPERATOR");
            }
            if (a.equals("+")){
                TokenList.add("ADD_OPERATOR");
            }
            if (a.equals("*")){
                TokenList.add("MUL_OPERATOR");
            }
            if (a.equals("/")){
                TokenList.add("DIV_OPERATOR");
            }
            if (a.equals("(")){
                TokenList.add("LEFT_PAREN");
            }
            if (a.equals(")")){
                TokenList.add("RIGHT_PAREN");
            }
            if (a.equals("[")){
                TokenList.add("LEFT_BRACK");
            }
            if (a.equals("]")){
                TokenList.add("RIGHT_BRACK");
            }
            if (a.equals(">")){
                TokenList.add("GT_OPERATOR");
            }
            if (a.equals("<")){
                TokenList.add("LT_OPERATOR");
            }
            if (a.equals("~=")){
                TokenList.add("NE_OPERATOR");
            }
            if (a.equals("==")){
                TokenList.add("EQ_OPERATOR");
            }
            if (a.equals("<=")){
                TokenList.add("LE_OPERATOR");
            }
            if (a.equals(">=")){
                TokenList.add("GE_OPERATOR");
            }
            if (a.equals("specifications")){
            TokenList.add("");
            }
            if (a.equals("specifications")){
            TokenList.add("SPECIFICATIONS");
            }
            if (a.equals("symbol")){
            TokenList.add("SYMBOLS");
            }
            if (a.equals("forward")){
            TokenList.add("FORWARDS");
            }
            if (a.equals("references")){
            TokenList.add("");
            }
            if (a.equals("function")){
            TokenList.add("");
            }
            if (a.equals("pointer")){
            TokenList.add("");
            }
            if (a.equals("array")){
            TokenList.add("");
            }
            if (a.equals("type")){
            TokenList.add("");
            }
            if (a.equals("type")){
            TokenList.add("");
            }
            if (a.equals("struct")){
            TokenList.add("");
            }
            if (a.equals("enum")){
            TokenList.add("");
            }
            if (a.equals("global")){
            TokenList.add("");
            }
            if (a.equals("declarations")){
            TokenList.add("DECLARATIONS");
            }
            if (a.equals("implementations")){
            TokenList.add("");
            }
            if (a.equals("main")){
            TokenList.add("MAIN_HEAD");
            }
            if (a.equals("parameters")){
            TokenList.add("");
            }
            if (a.equals("constant")){
            TokenList.add("");
            }
            if (a.equals("begin")){
            TokenList.add("");
            }
            if (a.equals("endfun")){
            TokenList.add("");
            }
            if (a.equals("if")){
            TokenList.add("");
            }
            if (a.equals("then")){
            TokenList.add("");
            }
            if (a.equals("else")){
            TokenList.add("");
            }
            if (a.equals("endif")){
            TokenList.add("");
            }
            if (a.equals("repeat")){
            TokenList.add("");
            }
            if (a.equals("until")){
            TokenList.add("");
            }
            if (a.equals("endrepeat")){
            TokenList.add("");
            }
            if (a.equals("display")){
            TokenList.add("");
            }
            if (a.equals("set")){
            TokenList.add("");
            }
            if (a.equals("return")){
            TokenList.add("");
            }
            if (a.equals("integer")){
            TokenList.add("TYPE_NAME");
            }
            if (a.equals("float")){
            TokenList.add("TYPE_NAME");
            }
        }

        System.out.println();
        for (int a = 0; a < TokenList.size(); a++){
            String iterate = TokenList.get(a);
            System.out.println(iterate);

            // Print the Token list that we colleceted from our if statements

        }
    }
}