package org.spoto;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        Usem ul = new Usem("111","3333");
        Usem ul2 = new Usem("222","3333444");
        Usem ul3 = new Usem("333","5555");

        HashMap<String, Usem> map = new HashMap<String, Usem>();
        //或者Map<String, Usem> map = new HashMap<String, Usem> 用父类Map接收
        //往map中添加数据
        map.put("index1",ul);
        map.put("index2",ul2);
        map.put("index3",ul3);
        //移除
        map.remove("index2");

        for ( String str :map.keySet()) {
            System.out.println(str);
            Usem value =  map.get(str);
            System.out.println(value.getName() + "====" + value.getPassword());
        }
    }
}
