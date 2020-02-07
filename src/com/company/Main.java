package com.company;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<News> listNews = new LinkedList<>();
        JournalisteDao jdao = new JournalisteDao();
        jdao.CreateJournaliste();
        jdao.ReadById(1);
        NewsDao ndao = new NewsDao();
        CollectNews cnw = new CollectNews();
        listNews = ndao.readAllNews();
        cnw.ReadIdNews("aymane","#virus",listNews);
    }
}