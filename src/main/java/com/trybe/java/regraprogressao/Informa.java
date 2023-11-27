package com.trybe.java.regraprogressao;

public class Informa {

  /**
   * Lint horrível.
   */

  public static void resultado(double notaTotal) { // Alteração para double
    int somaDosPesos = 100;
    double notaFinal = Calcular.notaFinal(notaTotal, somaDosPesos);
    int notaMinima = 85;
    boolean resultado = Verifica.resultado(notaFinal, notaMinima);

    if (resultado) {
      System.out.println("Parabéns! Você alcançou "
          + notaFinal
          + "%. E temos o prazer de que você obteve aprovação! ");
    } else {
      System.out.println("Lamentamos informar que, "
          + "com base na sua pontuação alcançada neste período, "
          + notaFinal
          + "%. "
          + "Você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}
