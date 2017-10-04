package Classe;
import java.sql.*;

import javax.swing.JOptionPane;
public class Conexao {
      public static Statement stm;
      public static ResultSet rs;
      public static PreparedStatement pst;
      public static Connection conn;


    private static Connection conexao;
    public Conexao()
    { try
        {
          
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\Marcos\\Documents\\NetBeansProjects\\projetopagamento\\FolhaPagamento\\db\\projetopagamento.db";  
            
          conexao = DriverManager.getConnection(url);
          System.out.println("conexao ok");
          //JOptionPane.showMessageDialog(null,"conexao ok");
         
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
          "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
    

    
    }
    // Mtodos pblicos:
    public Connection getConexao()
    {
        return conexao;
       
    }
    
    public static void executaSQL(String sql){
        try{
            stm = conn.createStatement(rs.CONCUR_READ_ONLY, rs.TYPE_SCROLL_INSENSITIVE);
            rs = stm.executeQuery(sql);
        }catch(SQLException ex){
            ex.getMessage();
        }
    }



}
