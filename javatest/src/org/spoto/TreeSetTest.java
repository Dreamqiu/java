package org.spoto;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("cccc");
        set.add("bbb");
        set.add("eeeee");
        set.add("aaa");
        set.add("bbb");
        for ( String str:set) {
            System.out.println(str);
        }

    }
}

