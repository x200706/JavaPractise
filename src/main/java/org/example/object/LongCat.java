package org.example.object;

public class LongCat {
    public String color = "white"; // 長貓的顏色屬性
    public double length = 162.5; // 長貓的身高屬性

    public LongCat(String color, double length) {
        this.color = color; //this.color是指外面那個color
        this.length = length;
    }

    //一但有了自定義建構子，預設的空參數建構子就會消失，需要的話要自行補上
    public LongCat() {
    }

    public LongCat(double length) {
        this.length = length;
    }

    //在建構子中呼叫另個建構子
//    public LongCat(String color, double length) {
//        this(length);
//        this.color = color;
//    }
}
