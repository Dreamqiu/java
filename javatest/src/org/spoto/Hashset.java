package org.spoto;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
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
