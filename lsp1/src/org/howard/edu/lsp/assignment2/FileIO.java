package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;


public class FileIO {
	//Check for numbers 
    public static boolean isNumeric(String str) {
        try {  
            Double.parseDouble(str);  
                return true;
        } catch (NumberFormatException e)   {  
            return false;  
        }  
    }
    //Remove punctuation from String
    private static final Pattern PUNCT_SYMBOLS =
            Pattern.compile("[!\"#$%&()*+,-./:;<=>?@\\[\\]^_{|}~]");
 
    public static String removePunctuations(String source) {
        return PUNCT_SYMBOLS.matcher(source).replaceAll("");
    }

    public static void main(String[] args){
        //Write to file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("words.txt"));
            writer.write("Fear leads to anger\nAnger leads to hatred\nHatred leads to conflict\nand Conflict leads to suffering times 1000.\nDon't fEar 100people");
            writer.close();
        }   catch (IOException e) {
            e.printStackTrace();
        }
        //Read file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            String line;
            HashMap<String, Integer> wordCount = new HashMap<>();//Store words and count them
            while((line = reader.readLine()) != null){
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() <= 3 || isNumeric(word)) {
                        continue;
                    }
                    word = removePunctuations(word);//Remove punctuations
                    word = word.toLowerCase();//Change all words to lower case
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            }
            reader.close();
            Set<Map.Entry<String, Integer>>set = wordCount.entrySet();
            for (Map.Entry<String, Integer> mapEntry : set) {
                System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
            }
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}
