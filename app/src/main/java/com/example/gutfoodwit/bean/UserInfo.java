package com.example.gutfoodwit.bean;
public class UserInfo {
    public long rowid; // 行号
    public int xuhao; // 序号
    public String name; // 姓名
    public String phone; // 手机号
    public String password; // 密码

    public UserInfo() {
        rowid = 0L;
        xuhao = 0;
        name = "";
        phone = "";
        password = "";
    }
}