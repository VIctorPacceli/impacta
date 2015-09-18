/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.impacta.ads.lp3.empresa.dao.jdbc;

import br.edu.impacta.ads.lp3.empresa.model.Cargo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class CargoDAO implements GenericoDAO<Cargo> {

    @Override
    public List<Cargo> listar() {
        List<Cargo> cargos = new ArrayList<Cargo>();
        try {
            //conexao c = new conexao();
            Connection connection = conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM EMPRESA.CARGO");
            while (result.next()) {
                Cargo cargo = new Cargo();
                cargo.setCodigo(result.getInt("ID_CARGO"));
                cargo.setNome(result.getString("NOME"));
                cargos.add(cargo);

            }
            connection.close();
        } catch ( SQLException ex) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargos;
    }

    @Override
    public void alterar(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
