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
    if (a.equals("[]")){
    TokenList.add("LEFT_BRACK");
    TokenList.add("RIGHT_BRACK");
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
    TokenList.add("REFERENCE");
    }
    if (a.equals("function")){
    TokenList.add("FUNCTION");
    }
    if (a.equals("pointer")){
    TokenList.add("POINTER");
    }
    if (a.equals("array")){
    TokenList.add("ARRAY");
    }
    if (a.equals("type")){
    TokenList.add("TYPE");
    }
    if (a.equals("struct")){
    TokenList.add("STRUCT");
    }
    if (a.equals("enum")){
    TokenList.add("ENUM");
    }
    if (a.equals("global")){
    TokenList.add("GLOBAL");
    }
    if (a.equals("declarations")){
    TokenList.add("DECLARATIONS");
    }
    if (a.equals("implementations")){
    TokenList.add("IMPLEMENTATION");
    }
    if (a.equals("main")){
    TokenList.add("MAIN_HEAD");
    }
    if (a.equals("parameters")){
    TokenList.add("PARAMETERS");
    }
    if (a.equals("constant")){
    TokenList.add("CONST");
    }
    if (a.equals("begin")){
    TokenList.add("BEGIN");
    }
    if (a.equals("endfun")){
    TokenList.add("ENDFUN");
    }
    if (a.equals("if")){
    TokenList.add("IF");
    }
    if (a.equals("then")){
    TokenList.add("THEN");
    }
    if (a.equals("else")){
    TokenList.add("ELSE");
    }
    if (a.equals("endif")){
    TokenList.add("ENDIF");
    }
    if (a.equals("repeat")){
    TokenList.add("REPEAT");
    }
    if (a.equals("until")){
    TokenList.add("UNTIL");
    }
    if (a.equals("endrepeat")){
    TokenList.add("ENDREPEAT");
    }
    if (a.equals("display")){
    TokenList.add("DISPLAY");
    }
    if (a.equals("set")){
    TokenList.add("SET");
    }
    if (a.equals("return")){
    TokenList.add("RETURN");
    }
    if (a.equals("integer")){
    TokenList.add("TYPE_NAME");
    }
    if (a.equals("float")){
    TokenList.add("TYPE_NAME");
    }
    if (a.matches("[0-9]+")){
    TokenList.add("CONST_INT");
    }
    
    if (a.equals("i")){
    TokenList.add("ID");
    }
    if (a.equals("j")){
    TokenList.add("ID");
    }
    if (a.equals("max_elem")){
    TokenList.add("MAX_ELEM");
    }
    if (a.equals("max_array")){
    TokenList.add("MAX_ARRAY");
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