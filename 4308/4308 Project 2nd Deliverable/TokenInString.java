import java.util.StringTokenizer;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class TokenInString
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
    for (int start=0; start < length;){
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
    if (a.equals("import")){
    TokenList.add("IMPORT");
    }
    start++;
    }
    
    System.out.println();
    for (int a = 0; a < TokenList.size(); a++){
    String iterate = TokenList.get(a);
    System.out.println(iterate);
    
    // Print the Token list that we colleceted from our if statements
    
    }
    
    // WHERE THE PARSER STARTS::::::
    HashMap<String, Integer> hmap = new HashMap<>();
    // Creating a hashmap that we will fill with our Lexemes that we will be using with reference numbers 
    
    hmap.put("ASSIGNMENT_OPERATOR", 100);
    hmap.put("ADD_OPERATOR", 101);
    hmap.put("MUL_OPERATOR", 102);
    hmap.put("DIV_OPERATOR", 103);
    hmap.put("LEFT_PAREN", 104);
    hmap.put("RIGHT_PAREN", 105);
    hmap.put("LEFT_BRACK", 106);
    hmap.put("RIGHT_BRACK", 107);
    hmap.put("GT_OPERATOR", 108);
    hmap.put("LT_OPERATOR", 109);
    hmap.put("NE_OPERATOR", 110);
    hmap.put("EQ_OPERATOR", 111);
    hmap.put("LE_OPERATOR", 112);
    hmap.put("GE_OPERATOR", 113);
    hmap.put("SPECIFICATIONS", 114);
    hmap.put("SYMBOLS", 115);
    hmap.put("FORWARDS", 116);
    hmap.put("REFERENCE", 117);
    hmap.put("FUNCTION", 118);
    hmap.put("POINTER", 119);
    hmap.put("ARRAY", 120);
    hmap.put("TYPE", 121);
    hmap.put("STRUCT", 122);
    hmap.put("ENUM", 123);
    hmap.put("GLOBAL", 124);
    hmap.put("DECLARATIONS", 125);
    hmap.put("IMPLEMENTATION", 126);
    hmap.put("MAIN_HEAD", 127);
    hmap.put("PARAMETERS", 128);
    hmap.put("CONST", 129);
    hmap.put("BEGIN", 130);
    hmap.put("ENDFUN", 131);
    hmap.put("IF", 132);
    hmap.put("THEN", 133);
    hmap.put("ELSE", 134);
    hmap.put("ENDIF", 135);
    hmap.put("REPEAT", 136);
    hmap.put("UNTIL", 137);
    hmap.put("ENDREPEAT", 138);
    hmap.put("DISPLAY", 139);
    hmap.put("SET", 140);
    hmap.put("RETURN", 141);
    hmap.put("TYPE_NAME", 142);
    hmap.put("CONST_INT", 143);
    hmap.put("ID", 144);
    hmap.put("MAX_ELEM", 145);
    hmap.put("MAX_ARRAY", 146);
    hmap.put("IMPORT", 147);
                
    
    Set set = hmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
    Map.Entry nextentry = (Map.Entry)iterator.next();
    System.out.print("This Lexeme is "+ nextentry.getKey() + " & The key value for the Lexeme is : ");
    System.out.println(nextentry.getValue());
      }
    // Using this simple iteration to show the full hash map and the references 
      
    for (int a = 0; a < TokenList.size(); a++){
    String iterate = TokenList.get(a);
    if (hmap.containsKey(iterate)){
    System.out.println("The hmap contains this key : " + hmap.get(iterate));
    }
    else {
    System.out.println("The hmap does not contain this key");
    }
    }
    // This for loop iterates through the string array and loops up the string value in the hashmap. Once found, it displays the number reference for that value. This is the parser.
    // ::::::: WHERE THE PARSER ENDS
    }
   }