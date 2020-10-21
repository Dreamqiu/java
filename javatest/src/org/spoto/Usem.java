package org.spoto;

public class Usem {
    private String name;

    private String password;

    //构造函数
    public Usem(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //类属性赋值的几种方式
    //1.get,set
    //2.传参
    //3.构造函数初始化数据
    //4.pass
}
