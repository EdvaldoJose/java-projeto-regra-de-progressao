package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * App.
 */
public class App {
  ArrayList<Atividade> atividades = new ArrayList<Atividade>();

  /**
   * Lint horrível.
   */

  public static void main(String[] args) {
    App app = new App();
    app.cadastrarAtividade();

    Verifica.somaPesos(app.atividades);

    Calcular calcular = new Calcular(app.atividades);
    final double notaTotal = calcular.calcularNotas(); // Alteração para double

    Informa.resultado(notaTotal);
  }

  private Scanner novoScanner() {
    return new Scanner(System.in);
  }

  private void cadastrarAtividade() {
    Scanner scanner = novoScanner();
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantidadeAtividades = Integer.parseInt(scanner.nextLine()); // Alteração para nextLine()

    for (int i = 0; i < quantidadeAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      String nome = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      int peso = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite a nota obtida para " + nome + ":");
      double nota = Double.parseDouble(scanner.nextLine()); // Alteração para double

      Atividade atividade = new Atividade(nome, peso, nota);
      atividades.add(atividade);
    }
    scanner.close();
  }
}