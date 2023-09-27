package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Cliente {
    Scanner scanner = new Scanner(System.in);

    List<Cliente> listCliente = new ArrayList<>();

    public Cliente pesquisarCliente(long cpf){
        for (Cliente cliente: listCliente) {
            long validaCPF = cliente.getCPF();
            if (validaCPF == cpf){
                return cliente;
            }
        }
        return null;
    }

    public void listarClientes(){
        for (Cliente cliente: listCliente){
            System.out.println(cliente.getNome());
            System.out.println(getCPF());
        }
    }

    public void adicionarCliente(Cliente cliente){
        listCliente.add(cliente);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getCPF() {
        return CPF;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public long getRG() {
        return RG;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getTelefone() {
        return telefone;
    }

    private String nome, endereco;
    private long CPF, RG, telefone;

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
