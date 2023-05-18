package org.example;

import org.example.object.LongCat;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CH04 {
    @Test
    public void isSameString() {
        var a = "C"+"at"; //背後有StringBuilder在運作
        var b = "Cat";
        System.out.println(a == b);
    }

    @Test
    public void isSame1() {
        var a = new String("番茄");
        var b = new String("番茄");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    @Test
    public void isSame() {
        var a = "番茄";
        var b = "番茄";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    @Test
    public void isSame0() {
        var a = 1;
        var b = 1;
        var c = 1;
        System.out.println(a == b);
        System.out.println(a == c);
    }

    @Test
    public void kiminonawa() {
        var msg = "君の名は？";
        var userInput = new Scanner(System.in);
        System.out.println(msg + "我的名字是: " + userInput.nextLine());
    }

    @Test
    public void longCatTest() {
        LongCat orangeLongCat = new LongCat();
        orangeLongCat.color = "orange";
        orangeLongCat.length = 162.5;

        LongCat whiteLongCat = new LongCat();
        whiteLongCat.color = "white";
        whiteLongCat.length = 170.0;

        //試試看新版Java（來自JDK15）的文字塊，換行再也不用\n\n
        String str = """
                橘色長貓的顏色是：%s
                橘色長貓的身高是：%.1f
                                    
                白色長貓的顏色是：%s
                白色長貓的身高是：%.1f
                """.formatted(orangeLongCat.color, orangeLongCat.length,
                whiteLongCat.color, whiteLongCat.length);
        System.out.println(str);
    }
}