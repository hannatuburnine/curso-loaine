package aula52;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao = obterOpcaoMenu(scan);

    }
    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida){
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contado");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");
            opcao = scan.nextInt();

            try {
                opcao = scan.nextInt();

                if (opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            }
            catch (Exception e){
                System.out.println("Entrada inválida");
            }
        }



            return opcao;
        }
    }

