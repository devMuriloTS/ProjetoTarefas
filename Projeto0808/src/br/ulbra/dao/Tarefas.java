
package br.ulbra.dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tarefas {
    ArrayList listaTarefas;
    public Tarefas(){
        listaTarefas = new ArrayList();
    }
    public void salvar(String elemento){
        listaTarefas.add(elemento);
        JOptionPane.showMessageDialog(null, "Salvo bem tranquilinho, paizao!");
        
    }
    public String listar (){
        String res="";
        if (listaTarefas.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sua lista de tarefas encontra-se vazia!");
        }else{
            for (int i=0; i<listaTarefas.size(); i++){
                res += (i+1)+"-"+listaTarefas.get(i)+"\n";
            }
        }
        return res;
    }
    public void remover(int i){
        if (listaTarefas.isEmpty()){
            JOptionPane.showMessageDialog(null,"Ímpossivel excluir, lista vazia!");
        }else{
            if((i-1)>=0&&(i-1)<listaTarefas.size()){
            listaTarefas.remove(i-1);
            JOptionPane.showMessageDialog(null,"Removido com suceso!");
            }else{
                JOptionPane.showMessageDialog(null,"Este item não existe!");
            }
        }
    }
    public void alterar(int i, String novo){
         if (listaTarefas.isEmpty()){
            JOptionPane.showMessageDialog(null,"Lista vazia!");
         }else{
            if((i-1)>=0&&(i-1)<listaTarefas.size()){
            listaTarefas.set(i-1,novo);
            JOptionPane.showMessageDialog(null,"Item alterado com suceso!");
            }else{
                JOptionPane.showMessageDialog(null,"Este item não existe!");
            }
        }
    }
}
