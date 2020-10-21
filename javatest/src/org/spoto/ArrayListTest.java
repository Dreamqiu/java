package org.spoto;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
//        List<String> l = new ArrayList<String>();
//        //往数组l中添加数据
//        l.add("xxxx");
//        l.add("sss");
//        l.add("aaaa");
//        l.add("baa");
//        for (int i = 0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
//        //取数据使用这种循环很方便，这种方式只能用于取数
//        for( String str : l){
//            System.out.println(str);
//        }
//        Collections.sort(l);//排序
//        l.remove(2);//删除数组中的元素
//        //迭代器取数据
//        Iterator<String> it = l.iterator();
//        while (it.hasNext()){
//           String next = it.next(); //有下一个的时候取出
//           System.out.println(next);
//        }

        //使用set，get赋值
//         Usem ul = new Usem();
//        ul.setName("111");
//        ul.setPassword("222");
        //使用类当中的构造函数赋值
        Usem ul = new Usem("111","3333");
        Usem ul2 = new Usem("222","3333444");
        Usem ul3 = new Usem("333","5555");
        Usem ul4 =new Usem("444","hhhhhh");

        List<Usem> l = new ArrayList<Usem>();  //可以加类的数据类型
        l.add(ul);
        l.add(ul2);
        l.add(ul3);
        for( Usem us:l){
            System.out.println(us.getName());
            System.out.println(us.getPassword());
        }
    }
}
