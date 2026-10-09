package Initializer;

import View.Menus;

import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Scanner r =  new Scanner(System.in);

        System.out.println("\n\n=================> STORE-EAZY <=================\n\n");
        Menus.menuPrincipal(r);
    }
}
