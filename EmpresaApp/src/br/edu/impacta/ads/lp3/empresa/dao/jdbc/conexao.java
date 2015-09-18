/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.impacta.ads.lp3.empresa.dao.jdbc;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 * Implementação Singleton para a conexão com a base de dados
 */
public class conexao implements Serializable{ 

    private static conexao conexao;
    public conexao() {
    
    }
    
 public static conexao getInstance(){
 if(conexao == null){
 conexao = new conexao();
 }
 return conexao;
 }
 public Connection getConnection (){
 Connection connection = null;
 
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
             connection  = DriverManager.getConnection("jdbc:derby://localhost:1527/Empresa","fit","fit");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
 
            return connection;
 }
 
 }
 

    

