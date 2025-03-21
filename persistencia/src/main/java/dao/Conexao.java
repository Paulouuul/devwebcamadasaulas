package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    static String url = "jdbc:postgresql://localhost:5432/universidade";
    static String user = "postgres";
    static String password = "postgres";



    public static void main(String[] agrs){
        
        
        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão estabelecida!");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
