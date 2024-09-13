/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class ListaConsul {
          private static final List<Consulta> lista = new ArrayList<>();
    
    
    public static List<Consulta> listar(){
        return lista;
    }
    
    public static void adicionar(Consulta consul){
        lista.add(consul);
    }
    
    public static Consulta obtemPaciente(int id) {
        return lista.get(id);
    }
    
    public static void atualizar(int id, Consulta consul) {
        lista.set(id, consul);
    }
}
