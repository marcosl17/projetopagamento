/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class Acao {
    
    public static boolean Incluir(Funcionario objpes) throws SQLException{
        PreparedStatement pstmt =
        Conexao.getConnection().prepareStatement
        ("INSERT INTO funcionario (nome, cargo, ganho, cidade, estado_sg, sexo, inss, irrf, fgts, auxtrans)" +
                " VALUES (?,?,?,?,?,?,?,?,?,?)");
       pstmt.setString(1,objpes.getNome());
       pstmt.setString(2,objpes.getCargo());
       pstmt.setDouble(3,objpes.getGanho());
       pstmt.setString(4,objpes.getCidade());
       pstmt.setString(5,objpes.getEstado_sg());
       pstmt.setString(6,objpes.getSexo());
       pstmt.setDouble(7,objpes.getInss());
       pstmt.setDouble(8,objpes.getIrrf());
       pstmt.setDouble(9,objpes.getFgts());
       pstmt.setDouble(10,objpes.getAuxtrans());
      
        int registros = pstmt.executeUpdate();
        pstmt.close();// fecha a conexao
        if (registros == 1){
            return true; }
        else {
            return false; 
        }
    }
    
        
    public static void excluirDados(Funcionario objpes) throws SQLException{
        try{
        PreparedStatement pstmt =
        Conexao.getConnection().prepareStatement("DELETE FROM funcionario where codigo=?");
       
        pstmt.setInt(1,objpes.getCodigo());
        pstmt.execute();
        
         } catch (Exception ex){
             ex.getMessage();
         }
    }
    
    
    public static Funcionario Pesquisar(String nome) throws SQLException{
        ArrayList<Funcionario> FuncionarioLista = new ArrayList<>();
        
        Funcionario objpes = new Funcionario();
        
        PreparedStatement pstmt =
        Conexao.getConnection().prepareStatement("SELECT * FROM funcionario where nome = ?");
        pstmt.setString(1,nome);

        ResultSet rs = pstmt.executeQuery();
        //objpes = null;
        if (rs.next()){
           //objpes = new Funcionario();
            objpes.setCodigo(rs.getInt("codigo"));
            objpes.setNome(rs.getString("nome").trim());
            objpes.setCargo(rs.getString("cargo"));
            objpes.setGanho(rs.getDouble("ganho"));
            objpes.setSexo(rs.getString("sexo"));
            objpes.setCidade(rs.getString("cidade"));
            objpes.setEstado_sg(rs.getString("estado_sg"));
         }
          pstmt.close();
          
        return objpes;
    }
}
