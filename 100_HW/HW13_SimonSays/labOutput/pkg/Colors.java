package pkg;

public class Colors {
    public static String  RESET ="\u001B[0m";
    public static String  BLACK  = "\u001B[30m";
    public static String  RED    = "\u001B[31m";
    public static String  GREEN  = "\u001B[32m";
    public static String  YELLOW = "\u001B[33m";
    public static String  BLUE   = "\u001B[34m";
    public static String  PURPLE = "\u001B[35m";
    public static String  CYAN   = "\u001B[36m";
    public static String  WHITE  = "\u001B[37m";

    public static String  BRIGHT_BLACK  = "\u001B[90m";
    public static String  BRIGHT_RED    = "\u001B[91m";
    public static String  BRIGHT_GREEN  = "\u001B[92m";
    public static String  BRIGHT_YELLOW = "\u001B[93m";
    public static String  BRIGHT_BLUE   = "\u001B[94m";
    public static String  BRIGHT_PURPLE = "\u001B[95m";
    public static String  BRIGHT_CYAN   = "\u001B[96m";
    public static String  BRIGHT_WHITE  = "\u001B[97m";

    public static String  BG_BLACK  = "\u001B[40m";
    public static String  BG_RED    = "\u001B[41m";
    public static String  BG_GREEN  = "\u001B[42m";
    public static String  BG_YELLOW = "\u001B[43m";
    public static String  BG_BLUE   = "\u001B[44m";
    public static String  BG_PURPLE = "\u001B[45m";
    public static String  BG_CYAN   = "\u001B[46m";
    public static String  BG_WHITE  = "\u001B[47m";

    public static String  BRIGHT_BG_BLACK  = "\u001B[100m";
    public static String  BRIGHT_BG_RED    = "\u001B[101m";
    public static String  BRIGHT_BG_GREEN  = "\u001B[102m";
    public static String  BRIGHT_BG_YELLOW = "\u001B[103m";
    public static String  BRIGHT_BG_BLUE   = "\u001B[104m";
    public static String  BRIGHT_BG_PURPLE = "\u001B[105m";
    public static String  BRIGHT_BG_CYAN   = "\u001B[106m";
    public static String  BRIGHT_BG_WHITE  = "\u001B[107m";


    // Methods for print output without new line

    // Function for print blank print
    public static void print(){
        System.out.print("");
    }
   
    public static void print(String output){
        System.out.print(output);
    }
    
    // function for print colored text without new line
    public static void print(String output,String text){
        System.out.print(getColor(text)+output+RESET);
    }
    // function for print output without new line
    public static void print(String output,String text,String backgroud){
        System.out.print(getColor(text)+getColor(backgroud)+output+RESET);
    }

    // function for print blank print
    public static void println(){
        System.out.println();
    }
   
    // function for print output with new line
    public static void println(String output){
        System.out.println(output);
    }
    
    // function for print colored text with new line

    public static void println(String output,String text){
        System.out.println(getColor(text)+output+RESET);
    }

    // function for print output with new line
    public static void println(String output,String text,String backgroud){
        System.out.println(getColor(text)+getColor(backgroud)+output+RESET);
    }

    public static String getColor(String colorName){
        if (colorName == null) return RESET;

        switch (colorName.toUpperCase()) {
            case "GREY": return BLACK;
            case "RED": return RED;
            case "GREEN": return GREEN;
            case "YELLOW": return YELLOW;
            case "BLUE": return CYAN;
            case "PURPLE": return PURPLE;
            case "CYAN": return CYAN;
            case "WHITE": return WHITE;

            case "BRIGHT_BLACK": return BRIGHT_BLACK;
            case "BRIGHT_RED": return BRIGHT_RED;
            case "BRIGHT_GREEN": return BRIGHT_GREEN;
            case "BRIGHT_YELLOW": return BRIGHT_YELLOW;
            case "BRIGHT_BLUE": return BRIGHT_BLUE;
            case "BRIGHT_PURPLE": return BRIGHT_PURPLE;
            case "BRIGHT_CYAN": return BRIGHT_CYAN;
            case "BRIGHT_WHITE": return BRIGHT_WHITE;

            case "BG_BLACK": return BG_BLACK;
            case "BG_RED": return BG_RED;
            case "BG_GREEN": return BG_GREEN;
            case "BG_YELLOW": return BG_YELLOW;
            case "BG_BLUE": return BG_BLUE;
            case "BG_PURPLE": return BG_PURPLE;
            case "BG_CYAN": return BG_CYAN;
            case "BG_WHITE": return BG_WHITE;

            case "BRIGHT_BG_BLACK": return BRIGHT_BG_BLACK;
            case "BRIGHT_BG_RED": return BRIGHT_BG_RED;
            case "BRIGHT_BG_GREEN": return BRIGHT_BG_GREEN;
            case "BRIGHT_BG_YELLOW": return BRIGHT_BG_YELLOW;
            case "BRIGHT_BG_BLUE": return BRIGHT_BG_BLUE;
            case "BRIGHT_BG_PURPLE": return BRIGHT_BG_PURPLE;
            case "BRIGHT_BG_CYAN": return BRIGHT_BG_CYAN;
            case "BRIGHT_BG_WHITE": return BRIGHT_BG_WHITE;

            default: return RESET; // fallback if not found
        }
    }

}
