package br.ulbra.dao;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Tarefas lista = new Tarefas();
        int op = 0;
        while (op != 5) {
            System.out.println("MENU");
            System.out.println("1 - Salvar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Alterar");
            System.out.println("5 - Sair");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe a tarefa: ");
                    ler.nextLine();
                    lista.salvar(ler.nextLine());
                    break;
                case 2:
                    lista.listar();
                    break;
                case 3:
                    lista.listar();
                    System.out.println("informe o item que deseja excluir");
                    int i = ler.nextInt();
                    lista.remover(i);
                    break;
                    case 4:
                    lista.listar();
                    System.out.println("informe o item que deseja alterar:");
                    int c = ler.nextInt();
                        System.out.println("Digite a nova tarefa:");
                        ler.nextLine();
                    String novo = ler.nextLine();
                    
                    lista.alterar(c,novo);
                    break;
                default:
                    if (op == 5) {
                        System.out.println("Tchau xiru !!!");
                    } else {
                        System.out.println("opção inválida");
                    }

            }

        }
    }
}
