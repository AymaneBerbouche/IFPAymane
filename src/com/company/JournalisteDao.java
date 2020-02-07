package com.company;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JournalisteDao {
    List<Journaliste> ListJournaliste = new ArrayList<Journaliste>();
    public List<Journaliste> CreateJournaliste() {
        String url = "jdbc:mysql://localhost:3306/ifp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        try{
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from ifp.journaliste";
            ResultSet rs = myStmt.executeQuery(sql);
            while(rs.next())
                ListJournaliste.add(new Journaliste(rs.getInt("id"),rs.getString("password"),rs.getString("name"), rs.getInt("credit")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ListJournaliste;
    }

    public void ReadById(int id) {
            for(Journaliste j : ListJournaliste){
                if(j.getId() == id)
                    System.out.println("Id: "+j.getId() + " Password: "+j.getPassword() + " Name: "+j.getName() + " Credit: "+j.getCredit());
            }
    }
}