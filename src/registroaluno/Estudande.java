/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroaluno;

/**
 *
 * @author 141052235
 */
public class Estudande {
    
    private int ID;
    private int Matricula;
    private String Nome;
    private String Sobrenome;
    private double Telefone;
    private double CEP;
    
    
    
    public Estudande(int eId, int eMatricula, String eNome, String eSobrenome, double eTelefone, double eCep ){
        setID(eId);
        setMatricula(eMatricula);
        setNome(eNome);
        setSobrenome(eSobrenome);
        setTelefone(eTelefone);
        setCEP(eCep);
    }
    
    //tester
    public Estudande(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public double getTelefone() {
        return Telefone;
    }

    public void setTelefone(double Telefone) {
        this.Telefone = Telefone;
    }

    public double getCEP() {
        return CEP;
    }

    public void setCEP(double CEP) {
        this.CEP = CEP;
    }
    
}
