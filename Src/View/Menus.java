package View;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {
    public static void menuPrincipal(Scanner r) {
        int option = 0;

        do {

            System.out.println("------------------ Menu Principal------------------");
            System.out.println("1. Adicioinar produto á uma sessão");
            System.out.println("2. Modificar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Mostrar produtos");
            System.out.println("5. Acesso restrito");
            System.out.println("6. Sair");

            //adicionar tratamento de entrada
            option = r.nextInt();


        } while (option != 5);
    }

    public static void menuCadastro(Scanner r) {
        int option = 0;

        do {

            System.out.println("------------------ Cadastro de produto ------------------");
            System.out.println("Qual a sessão do produto?");
            System.out.println("1. Eletrônicos");
            System.out.println("2. Alimentício");
            System.out.println("3. Farmaceuticos");
            System.out.println("4. Vestuário");
            System.out.println("5. Voltar");

            //validação de entrada
            option = r.nextInt();


        } while (option != 5);
    }

    public static void menuEncerramento(Scanner r) {
        System.out.println("------------------ Encerramento e finalização ------------------");
        System.out.println("É uma honra sempre ver você por aqui! Até logo ;)");

        r.close();
    }
}
