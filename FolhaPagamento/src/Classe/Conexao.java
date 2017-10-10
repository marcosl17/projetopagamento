
package Classe;

import java.sql.*;

public class Conexao {
    public static Statement stm;
    public static ResultSet rs;
    public static PreparedStatement pst;
    public static Connection con;
    
    public static Connection getConnection(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Marcos\\Documents\\NetBeansProjects\\projetopagamento\\FolhaPagamento\\db\\projetopagamento.db");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
    
    public static void executaSQL(String sql){
        try {
            stm = con.createStatement(rs.CONCUR_READ_ONLY, rs.TYPE_SCROLL_INSENSITIVE);
            rs = stm.executeQuery(sql);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
}
