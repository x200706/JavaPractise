package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class IsReverseWord {
    public static String[] words = {"RADAR", "WARTER START", "MILK KLIM", "RESERVERED", "IWI"};

    public void test() {
        //宣告解答List
        ArrayList<String> ansList = new ArrayList<>();

        //遍歷words
        for (String word : words) {
            //切字串，放入Deque 雙向佇列
            char[] checkArr = word.toCharArray();
            Deque<Character> checkDeque = new ArrayDeque<>();
            for (char element : checkArr) {
                checkDeque.add(element);
            }

            //比對從尾端取出是否等於從頭取出，是的話就放進答案陣列
//            if(相等){
//                ansList.add(word);
//            }
        }

        //print出答案陣列
        System.out.println(Arrays.toString(ansList.toArray()));
    }
}
