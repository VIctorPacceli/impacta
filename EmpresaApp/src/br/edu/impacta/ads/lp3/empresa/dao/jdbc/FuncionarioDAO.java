/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.impacta.ads.lp3.empresa.dao.jdbc;


import br.edu.impacta.ads.lp3.empresa.model.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class FuncionarioDAO implements GenericoDAO<Funcionario>{
    

 public List<Funcionario> listar(){
    List<Funcionario>  funcionarios = new ArrayList<>();
    try{
            Connection connection = conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("");
            while(result.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(result.getInt("ID_FUNCIONARIO"));
                funcionario.setNome(result.getString("NOME"));
            }
     } catch (SQLException ex) {
         Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
    return funcionarios;
 }

    @Override
    public void inserir(Funcionario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Funcionario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Funcionario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}