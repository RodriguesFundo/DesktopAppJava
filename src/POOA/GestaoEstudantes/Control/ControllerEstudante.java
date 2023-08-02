package POOA.GestaoEstudantes.Control;

import POOA.GestaoEstudantes.Model.Estudante;
import java.util.*;
import javax.swing.JOptionPane;
public class ControllerEstudante {
    ArrayList<Estudante> estudantes = new ArrayList<>();
    
    public void add(int codigo, String nome, double nota1, double nota2) {
        for (Estudante e : estudantes) {
            if (e.getCodigo() == codigo) {
                JOptionPane.showMessageDialog(null, 
                        "O código de estudante já está em uso.", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20) {
            JOptionPane.showMessageDialog(null, "As notas devem estar entre 0 e 20.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        estudantes.add(new Estudante(codigo, nome, nota1, nota2));
    }


    public void remove(int posicao){
        estudantes.remove(posicao);
    }
    
    public void edit(int posicao, int codigo, String nome, double nota1, double nota2){
        Estudante e = estudantes.get(posicao);
        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20) {
            JOptionPane.showMessageDialog(null, "As notas devem estar entre 0 e 20.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        e.setCodigo(codigo);
        e.setNome(nome);
        e.setNota1(nota1);
        e.setNota2(nota2);
    }
    
    public ArrayList<Estudante> list(){
        Collections.sort(estudantes);
        return estudantes;
    }
}
