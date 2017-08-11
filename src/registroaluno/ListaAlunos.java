/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroaluno;

import java.util.LinkedList;

/**
 *
 * @author 141052235
 */
public class ListaAlunos {
    
    private LinkedList<Estudande> EstList;
    
    public ListaAlunos(LinkedList TheList){
        setEstList(TheList);
    }
    
    public LinkedList<Estudande> getEstList() {
        return EstList;
    }

    public void setEstList(LinkedList<Estudande> EstList) {
        this.EstList = EstList;
    }
    
    
    
    
}
