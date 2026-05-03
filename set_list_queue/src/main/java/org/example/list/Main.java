package org.example.list;
import java.util.ArrayList;
import java.util.List;
//1) Напишите метод  public static List<String> transform(List<String> words) , который удалит у
//переданного списка все пустые слова, т.е. те слова, для которых  words.get(i).equals(””)  вернёт
//true .


public class Main {
    public static List<String> transform(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.print(i);
            if (words.get(i).equals("")) {
                words.remove(i);
                System.out.println(true );

                i+=1;
            }
            System.out.println(false);

        }
        return words;
    }
    public static void main(String[] args) {


        List<String> words= new ArrayList<>();
        words.add("cat");
        words.add("");
        words.add("dog");
        words.add("milk");
        words.add("");
        words.add("phone");

        transform( words);

        System.out.println(words);


    }
}
