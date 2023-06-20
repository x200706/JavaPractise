package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

public class IsReverseWord {
    public static String[] words = {"RADAR", "WARTER START", "MILK KLIM", "RESERVERED", "IWI"};

    @Test
    public void test() {
        //宣告解答List
        HashSet<String> ansSet = new HashSet<>();

        //遍歷words
        for (String word : words) {
            //切字串，放入Deque 雙向佇列
            char[] checkArr = word.toCharArray();
            Deque<Character> checkDeque = new ArrayDeque<>();
            for (char element : checkArr) {
                checkDeque.add(element);
            }

            //宣告一般方向的迭代器
            Iterator<Character> ascIterator = checkDeque.iterator();
            //宣告反向迭代器
            Iterator<Character> descIterator = checkDeque.descendingIterator();

            //比對兩個方向取出元素是否相等，是的話就放進答案陣列，一旦不符合就移除
            while (ascIterator.hasNext() && descIterator.hasNext()) {
                if (ascIterator.next().equals(descIterator.next())) {
                    ansSet.add(word);
                } else {
                    ansSet.remove(word);
                }
            }
        }

        //print出答案陣列
        System.out.println(Arrays.toString(ansSet.toArray()));
    }
}
