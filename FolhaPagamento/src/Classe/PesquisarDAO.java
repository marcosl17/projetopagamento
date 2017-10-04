package Classe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class PesquisarDAO {
    
    public Funcionario Pesquisar(String nome) throws SQLException
    {
     Funcionario objpes=new Funcionario();

        Conexao conexao = new Conexao();
        PreparedStatement pstmt =
       conexao.getConexao().prepareStatement(
        "SELECT * FROM funcionario where nome = ?");
        pstmt.setString(1,nome);

        ResultSet rs = pstmt.executeQuery();
        objpes = null;
        if (rs.next()){
           objpes = new Funcionario();
          // objpes.setCodigo(rs.getInt("codigo"));
            objpes.setNome(rs.getString("nome").trim());
            objpes.setIdade(rs.getInt("idade"));
        
         }
          pstmt.close();
        return objpes;
}

    
    
    
    
}
