package bin;

import lib.ShellAccessor;

import java.util.Locale;


public class Main extends ShellAccessor {

    /**
    static String getThisShite(String input){
        StringBuilder temp = new StringBuilder(input.length());
        String miniTemp = "\"";
        for(int i = 0; i < input.length(); i++){
            if (input.toCharArray()[i] == '\n'){
                temp.append(miniTemp + "\", ");
                miniTemp = "\"";
            } else if (input.toCharArray()[i] == '0'){
                temp.append(miniTemp);
                return temp.toString();
            } else
            miniTemp = miniTemp + input.toCharArray()[i];
        }
        return null;
    } **/

    public static void main(String[]args){
        System.out.println(checkAndColor("test \" hallo java color int intp this "));
    }



}