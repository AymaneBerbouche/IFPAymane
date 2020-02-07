package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewsDao {
    List<News> ListNews = new ArrayList<News>();

    public List<News> readAllNews() {
        String url = "jdbc:mysql://localhost:3306/ifp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from ifp.news";
            ResultSet rs = myStmt.executeQuery(sql);
            while (rs.next())
                ListNews.add(new News(rs.getString("titre"), rs.getInt("idJournaliste"), rs.getString("contenu"), rs.getDate("datePubli"), rs.getString("nomAuteur"), rs.getInt("facteurConfiance"), rs.getString("tags")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ListNews;
    }

}
