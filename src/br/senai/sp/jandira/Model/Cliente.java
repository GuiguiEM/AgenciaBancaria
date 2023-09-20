package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);

    public String nome, endereco;
    public long CPF, RG, telefone;

    public void cadastrarCliente(){

        System.out.println("------------ Cadastro do Cliente ------------");
        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Informe seu CPF: ");
        CPF = scanner.nextLong();
        System.out.print("Informe seu RG: ");
        RG = scanner.nextLong();
        System.out.print("Informe seu telefone: ");
        telefone = scanner.nextLong();
        System.out.print("Informe seu endereço: ");
        endereco = scanner.nextLine();
        scanner.nextLine();
        System.out.println("--------------------------------------------");
    }
}
