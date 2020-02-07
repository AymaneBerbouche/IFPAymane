package com.company;
public class Journaliste{
    Integer id;
    String password;
    String name;
    Integer credit;

    public Journaliste(Integer id,String password, String name, Integer credit) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.credit = credit;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCredit() { return credit; }

    public String getPassword() { return password; }
}
