import java.util.*;


public class Asterisk{
   static String replace_word(String sentence, String pattern){
      String[] word_list = sentence.split("\\s+");
      String my_result = "";
      String asterisk_val = "";
                  
      for (int i = 0; i < pattern.length(); i++)
      asterisk_val += '*';
      int my_index = 0;
      for (String i : word_list){
         if (i.compareTo(pattern) == 0)
            word_list[my_index] = asterisk_val;
         my_index++;
      }
      for (String i : word_list)
         my_result += i + ' ';
      return my_result;
   }
   public static void main(String[] args){
      String sentence = "This is a sample only, I'm christian hope cedeno studying information technology at Bukidnon state univers";
      String pattern = "christian";
      
      System.out.println(replace_word(sentence, pattern));
   }
}

