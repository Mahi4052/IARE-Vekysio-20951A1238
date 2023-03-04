#Using recursion

public class Main {
    public static void main(String[] args) {
        String paragraph = "Hello Recursion";
        System.out.println(reverseParagraph(paragraph));
    }

    private static String reverseParagraph(String paragraph) {
        String[] words = paragraph.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseWord(word)).append(" ");
        }
        return sb.toString();
    }

    private static String reverseWord(String word) {
        if (word.length() == 0) {
            return "";
        } else {
            return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
        }
    }
}

#Using multithreading

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Hello Multithereading";
        String[] words = paragraph.split("\\s+");

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (String word : words) {
            executor.execute(() -> System.out.print(reverseWord(word) + " "));
        }
        executor.shutdown();
    }



    private static String reverseWord(String word) {
        if (word.length() == 0) {
            return "";
        } else {
            return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
        }
    }
}


    
  
