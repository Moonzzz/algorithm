package com.moon.chapter1;

import org.junit.Test;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author pzz
 * @date 2020-06-11 下午 01:57
 */
public class chapter1 {
    private static final Section1 section1 = new Section1();

    @Test
    public void test1() throws InterruptedException {
        // 设置画布的宽和高
        // StdDraw.setCanvasSize(200,300);
        // 窗口长从左0到右100
        StdDraw.setXscale(0, 100);
        // 窗口宽从下0到上100
        StdDraw.setYscale(0, 100);

        StdDraw.line(1, 10, 10.0, 10.0);
        StdOut.print("hello".toUpperCase());
        Thread.sleep(5000);
    }

    @Test
    public void test2() {
        System.out.println(section1.question1_2_6("ACTGACG", "TGACGAC"));
    }

    @Test
    public void test3() {
        System.out.println(section1.question1_2_7("abced"));
    }
    
}
