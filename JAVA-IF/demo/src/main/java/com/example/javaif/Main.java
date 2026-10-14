package com.example.javaif;
import java.util.Scanner;
import com.example.javaif.Models.Pessoa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome);
        System.out.println("Olá, " + pessoa.getNome() + "!");

        scanner.close();
    }
}