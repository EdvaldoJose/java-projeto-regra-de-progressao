package com.trybe.java.regraprogressao;

import java.util.Scanner;
/**
 * App.
 */

public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");

    int quantidadeAtividades = Integer.parseInt(scanner.nextLine());
    int pesoTotal = 0;
    int pontuacaoTotal = 0;

    // Loop para cadastrar as atividades
    for (int i = 1; i <= quantidadeAtividades; i += 1) {
      System.out.printf("Digite o nome da atividade %s:%n", i);
      String nomeAtividade = scanner.nextLine();

      System.out.printf("Digite o peso da atividade %s:%n", i);
      int pesoAtividade = Integer.parseInt(scanner.nextLine());
      pesoTotal += pesoAtividade;

      System.out.printf("Digite a nota obtida para %s:%n", nomeAtividade);
      int notaAtividade = Integer.parseInt(scanner.nextLine());
      pontuacaoTotal += (pesoAtividade * notaAtividade);
    }

    scanner.close();

    double resultado = (double) pontuacaoTotal / pesoTotal;

    // Verifica se a soma dos pesos é diferente de 100
    if (pesoTotal < 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {

      // Verifica se o resultado é maior ou igual a 85
      if (resultado >= 85) {
        System.out.printf("Parabéns! Você alcançou %s%%!"
            + " E temos o prazer de informar que você obteve aprovação!%n", resultado);

      } else {
        System.out.printf("Lamentamos informar que, com base na sua pontuação"
            + " alcançada neste período, %s%%!"
            + " você não atingiu a pontuação mínima necessária para sua aprovação.%n", resultado);
      }
    }
  }
}