package com.moon.chapter1;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @author pzz
 * @date 2020-06-11 下午 01:55
 */
public class Section1 {
    public void test() {
        StdDraw.line(0, 1.0, 1, 1.0);
    }

    public boolean question1_2_6(String s1, String s2) {
        return s1.length() == s2.length() && s1.concat(s1).contains(s2);
    }

    public String question1_2_7(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        return question1_2_7(a) + question1_2_7(b);
    }
}
