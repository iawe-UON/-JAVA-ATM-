package com.proj;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> account = new ArrayList<Account>();
    private Scanner sc = new Scanner(System.in);

    //启动ATM系统，进入欢迎界面,欢迎
    //独立功能，独立方法
    public void start(){
        while (true) {
            System.out.println("====欢迎进入ATM系统=====");
            System.out.println("输入1：用户登录");
            System.out.println("输入2：进行开户");
            int temp = sc.nextInt();
            switch (temp){
                case 1:
                    System.out.println("---进行用户登录---");
                    break;
                case 2:
                    System.out.println("---进行开户---");
                    break;
                default:
                    System.out.println("---输入指令错误，请重新输入正确指令---");
            }
        }
    }
    private void CreateAccount(){
        //1.创建新的账户对象
        Account acc = new Account();
        //2.输入账户信息
        System.out.println("请输入你的账户名称");
        String Name = sc.next();
        acc.setCardName(Name);


    }

}
