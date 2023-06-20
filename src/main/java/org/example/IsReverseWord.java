package org.example;

import java.util.*;

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

            //宣告反向迭代器
            Iterator<Character> iterator = checkDeque.descendingIterator();
            //比對 從尾端取出 是否等於 先進先出，是的話就放進答案陣列
            while (iterator.hasNext()) {
                if (checkDeque.pop().equals(iterator.next())) {
                    ansList.add(word);
                }
            }
        }

        //print出答案陣列
        System.out.println(Arrays.toString(ansList.toArray()));
    }
}
