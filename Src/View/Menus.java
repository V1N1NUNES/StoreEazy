package View;

import Controller.menuController;
import Model.Classes.DTO_Product;

import java.util.Scanner;

public class Menus {
    public static void menuPrincipal(Scanner r) {
        int option = 0;

        do {

            System.out.println("\n\n------------------ Menu Principal------------------");
            System.out.println("1. Adicionar/cadastrar produto á uma sessão");
            System.out.println("2. Modificar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Mostrar produtos");
            System.out.println("5. Acesso restrito");
            System.out.println("6. Sair");

            //adicionar tratamento de entrada
            option = r.nextInt();

            menuController.menuPrincipalController(r, option);

        } while (option != 5);
    }

    public static void menuCadastro(Scanner r) {
        int option = 0;

        do {
            System.out.println("\n\n------------------ Cadastro de produto ------------------");
            System.out.println("Qual a sessão do produto?");
            System.out.println("1. Eletrônicos");
            System.out.println("2. Alimentício");
            System.out.println("3. Farmaceuticos");
            System.out.println("4. Vestuário");
            System.out.println("5. Voltar");

            //validação de entrada (nula, inexistente ou opção incorreta)
            option = r.nextInt();


            System.out.println("Digite o nome do produto:");
            String nome = r.next();

            System.out.println("Digite a descrição para o produto:");
            String desc = r.next();

            System.out.println("Digite a quantidade do produto que quer guardar em estoque:");
            int quant =  r.nextInt();

            System.out.println("Digite o valor unitário de cada produto:");
            double valorUnitario = r.nextDouble();

            System.out.println("Escolha qual é a sessão do produto:");
            System.out.println("1. Eletrônicos");
            System.out.println("2. Alimentício");
            System.out.println("3. Farmaceuticos");
            System.out.println("4. Vestuário");
            int sessaoProduto = r.nextInt();
            //validação e concatenação de sessão do produto com a opção
            menuController.menuCadastroController_sessao(r, sessaoProduto);
//PAREI AQUI
            menuController.menuCadastroController(r, option);

        } while (option != 5);
    }

    public static void menuEdicao(Scanner r) {
        int option = 0;

        do {

            System.out.println("\n\n------------------ Edição de produto------------------");
            System.out.println("1. Modificar o nome do produto");
            System.out.println("2. Modificar o preço do produto");
            System.out.println("3. Modificar a sessão do produto");
            System.out.println("4. Voltar");

            //adicionar tratamento de entrada
            option = r.nextInt();

            menuController.menuPrincipalController(r, option);

        } while (option != 5);
    }

    public static void menuExclusao(Scanner r) {

    }

    public static void menuListagem(Scanner r) {

    }

    public static void menuAreaRestrita(Scanner r) {
        int option = 0;
    }
    public static void menuEncerramento(Scanner r) {
        System.out.println("\n\n------------------ Encerramento e finalização ------------------");
        System.out.println("É uma honra sempre ver você por aqui! Até logo ;)\n");

        r.close();
        System.exit(0);
    }
}
