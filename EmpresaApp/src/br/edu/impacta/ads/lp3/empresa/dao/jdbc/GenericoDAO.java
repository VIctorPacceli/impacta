/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.impacta.ads.lp3.empresa.dao.jdbc;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Victor
 */
public interface GenericoDAO <E> extends Serializable{
     List <E> listar();
    
     void alterar (E e);
     void remover (E e);
     void inserir (E e);
    
}
