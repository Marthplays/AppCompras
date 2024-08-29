package br.com.alura.aplicacaodecompras.modelos.principal;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.alura.aplicacaodecompras.modelos.modelo.Compra.Compras;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Compras> compras = new ArrayList<>();

        System.out.println("Digite o limite do cartão: ");
        double limite = in.nextDouble();
        double saldo = limite;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar compra");
            System.out.println("2 - Exibir compras");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");

            int opcao = in.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a descrição do produto: ");
                in.nextLine();
                String descricao = in.nextLine();

                System.out.println("Digite o valor da sua compra: ");
                double valor = in.nextDouble();

                if (valor <= saldo) {
                    Compras compra = new Compras(descricao, valor);
                    compras.add(compra);
                    saldo -= valor;
                    System.out.println("Compra realizada!");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else if (opcao == 2) {
                if (compras.isEmpty()) {
                    System.out.println("Nenhuma compra foi feita!");
                } else {
                    System.out.println("\nCompras realizadas: ");
                    for (Compras compra : compras) {
                        System.out.println(compra.getDescricao() + " - " + compra.getValor());
                    }
                    System.out.println("Saldo: " + saldo);
                }
            } else if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
            in.close();
        }
    }
}