package com.kodilla.collections.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("-------------------");

        String x = "This is String";
        String y = "This is String";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("-------------------");

        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10567;
        d = 10567;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        System.out.println("-------------------");

        String s = "text";
        System.out.println(s.hashCode());
        s = s + "1";
        System.out.println(s.hashCode());
        String s1 = "text";
        System.out.println(s1.hashCode());
        String s2 = new String("text");
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2); // we have forced creating new object for String
        System.out.println(s1.equals(s2));

        String s3 = "test";
        String s4 = "test";
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
