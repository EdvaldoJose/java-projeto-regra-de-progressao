package com.trybe.java.regraprogressao;

import java.util.ArrayList;

public class Verifica {

  /**
   * Lint horrível.
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

  public static boolean resultado(double notaTotal, int notaMinima) {
    return notaTotal >= notaMinima;
  }
}
