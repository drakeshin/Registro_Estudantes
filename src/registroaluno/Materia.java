/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroaluno;

import java.util.Calendar;
import java.util.LinkedList;

/**
 *
 * @author 141052235
 */
public class Materia {
    private int id;
    private String curso;
    private Calendar calendario; // Não implementado ainda
    private double mensalidade; // ainda será implementado
    public int materiasAprovado = 0; //mesma situ.....talvez eu exclua U.U
    private LinkedList listaMateria; //blablabla umas lógicas ae
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMateriasAprovado() {
        return materiasAprovado;
    }

    public void setMateriasAprovado(int materiasAprovado) {
        this.materiasAprovado = materiasAprovado;
    }

    public LinkedList getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(LinkedList listaMateria) {
        this.listaMateria = listaMateria;
    }
    
    
    public Materia(){}//implementar viu =D

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String Curso) {
        this.curso = Curso;
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double Mensalidade) {
        this.mensalidade = Mensalidade;
    }
    
    
}
