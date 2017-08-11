/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroaluno;

import java.util.Calendar;

/**
 *
 * @author 141052235
 */
public class Materia {
    private int id;
    private String curso;
    private Calendar calendario;
    private double mensalidade;
    public int materiasAprovado = 0;
    
    
    public Materia(){}

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
