/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examappconsole;

import java.sql.*;

/**
 *
 * @author Tsiyon
 */
public class ReadQuestion {

    private Connection con;

    private Statement st;
    int q = 6;
    int count = 0;
    String[] questions = new String[q];
    String[] choiseA = new String[q];
    String[] choiseB = new String[q];
    String[] choiseC = new String[q];
    String[] answer = new String[q];
    String[][] all = {
        questions, choiseA, choiseB, choiseC, answer
    };

    public ReadQuestion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "ENTER");
            st = con.createStatement();

            System.out.println("connected to db");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("something wrong");
        }

    }

    public String[][] returnQuestions() {

        String query = "select * from exam.question";
        try {
            ResultSet rs = st.executeQuery(query);
            String num, chA, chB, chC, ans,que;

            while (rs.next()) {
                que = rs.getString("question");
                questions[count] = que;
                System.out.println("records              "+que);
                chA = rs.getString("choiseA");
                choiseA[count] = chA;
                chB = rs.getString("choiseB");
                choiseB[count] = chB;
                chC = rs.getString("choiseC");
                choiseC[count] = chC;
                ans = rs.getString("answer");
                answer[count] = ans;
                count++;
            }

        } catch (Exception e) {

        }

        return all;
    }

}
