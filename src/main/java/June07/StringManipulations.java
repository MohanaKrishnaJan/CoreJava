package June07;

import java.util.Arrays;

public class StringManipulations {
    public String vowelCount(String input){
    String string = input;
    int numOfVowels = string.replaceAll("[^aeiouAEIOU]","").length();
    return input +": "+numOfVowels;
    }
    public String checkAnagram(String s1, String s2){
        char[] sortedChars1 = s1.toCharArray();
        char[] sortedChars2 = s2.toCharArray();
        Arrays.sort(sortedChars1);
        Arrays.sort(sortedChars2);
        if(Arrays.equals(sortedChars1,sortedChars2))
            return "\""+s1+"\"" +" and \""+s2+"\" are Anagrams";
        return "\""+s1+"\"" +" and \""+s2+"\" are NOT Anagrams";
    }

    public void reversingEachWord(String text){
        String words[]=text.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        System.out.println(reverseWord.trim());
    }

    public boolean checkIfRotated(String s1, String s2){
        System.out.println("Strings to be checked :\"" + s1 + "\" , \"" + s2 + "\"");
        if(s1.length() != s2.length())
            return false;
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
