package view;

import java.util.Scanner;

import data.UsuarioData;
import model.UsuarioModel;

public class App {
    public static void main(String[] args) throws Exception {
        UsuarioModel obj = new UsuarioModel();
        UsuarioData DAO = new UsuarioData();
        int opcao=0;
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                System.out.println("----- MENU -----");
                System.out.println("\n1 - Novo Usuário" +
                "\n2 - Listar Usuários cadastrados"+
                "\n3 - Editar Usuário"+
                "\n4 - Excluir Usuário"+
                "\n9 - Sair");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("\n\n###### NOVO USUÁRIO ######");
                        System.out.println("Digite o nome:");
                        obj.setNome(entrada.next());
                        System.out.println("Digite o e-mail:");
                        obj.setEmail(entrada.next());
                        System.out.println("Digite o tipo [1-ADM | 2-Cliente]:");
                        obj.setTipo(entrada.nextInt());
                        if(DAO.incluir(obj)) System.out.println("\n\nSalvo!\n\n");
                        else System.out.println("\n\n######### Não salvou ########\n\n");
                        break;
                    case 2:
                        
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro:"+e.getMessage());
            }
        } while (opcao!=9);
    }
}
