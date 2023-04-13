package POOA.GestaoEstudantes;

import java.io.Serializable;

public class Estudante implements Serializable , Comparable<Estudante>{
    private int codigo;    
    private String Nome;
    private double Nota1, Nota2;

    public Estudante() {
    }

    public Estudante(int codigo, String Nome, double Nota1, double Nota2) {
        this.codigo = codigo;
        this.Nome = Nome;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double calculaMedia(){
        return (this.Nota1+this.Nota2)/2;
    }

    @Override
    public int compareTo(Estudante o) {
            if(this.codigo > o.codigo) return 1;
		if(this.codigo < o.codigo) return -1;
		return 0;
    }
       
}
