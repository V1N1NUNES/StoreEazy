package Initializer;

import View.Menus;

import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Scanner r =  new Scanner(System.in);

        System.out.println("=================> STORE-EAZY <=================");
        Menus.menuPrincipal(r);
    }
}
