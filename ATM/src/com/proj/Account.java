package com.proj;

public class Account {
    private String CardNumber;
    private String CardName;
    private char Gender;
    private String PassWord;
    private int Remind_money;//余额
    private int Limit_money;//限额

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.CardNumber = cardNumber;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        this.CardName = cardName;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        this.Gender = gender;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        this.PassWord = passWord;
    }

    public int getRemind_money() {
        return Remind_money;
    }

    public void setRemind_money(int remind_money) {
        this.Remind_money = remind_money;
    }

    public int getLimit_money() {
        return Limit_money;
    }

    public void setLimit_money(int limit_money) {
        this.Limit_money = limit_money;
    }
}
