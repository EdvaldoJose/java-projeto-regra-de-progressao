package com.trybe.java.regraprogressao;

import java.util.ArrayList;

/**
 * Realiza verificações relacionadas às atividades, como a soma dos pesos.
 */

public class Verifica {

  /**
   * Soma os pesos das atividades e verifica se a soma é igual a 100.
   * @param atividades Lista de atividades a serem verificadas.
   */

  public static void somaPesos(ArrayList<Atividade> atividades) {
    int somaDosPesos = 0;
    for (Atividade atividade : atividades) {
      somaDosPesos += atividade.getPeso();
    }

    if (somaDosPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      System.exit(1);
    }
  }

  /**
   * Verifica se a nota total é maior ou igual à nota mínima especificada.
   * @param notaTotal A nota total calculada.
   * @param notaMinima A nota mínima necessária.
   * @return Verdadeiro se a nota total for maior ou igual à nota mínima, falso caso contrário.
   */

  public static boolean resultado(double notaTotal, int notaMinima) {
    return notaTotal >= notaMinima;
  }
}
