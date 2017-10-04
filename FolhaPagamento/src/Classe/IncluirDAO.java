
package Classe;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class IncluirDAO {
    
    public boolean Incluir(Funcionario objpes) throws SQLException
    {
        Conexao conexao = new Conexao();

        PreparedStatement pstmt =
        conexao.getConexao().prepareStatement
        ("INSERT INTO funcionario (nome, cargo, ganho, cidade, estado_sg, sexo, inss, irrf, fgts)" +
                " VALUES (?,?,?,?,?,?,?,?,?)");
//       pstmt.setInt(1, objusuario.getCodigo());
       pstmt.setString(1,objpes.getNome());
       pstmt.setString(2,objpes.getCargo());
       pstmt.setInt(3,objpes.getGanho());
       pstmt.setString(4,objpes.getCidade());
       pstmt.setString(5,objpes.getEstado_sg());
       pstmt.setString(6,objpes.getSexo());
       pstmt.setDouble(7,objpes.getInss());
       pstmt.setDouble(8,objpes.getIrrf());
       pstmt.setDouble(9,objpes.getFgts());
      
        int registros = pstmt.executeUpdate();
        pstmt.close();// fecha a conexao
        if (registros == 1){
            return true; }
        else {
            return false; }

}

 
}
