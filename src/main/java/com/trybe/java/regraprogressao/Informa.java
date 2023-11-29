package com.trybe.java.regraprogressao;

/**
 * Fornece informações sobre o resultado com base na nota total.
 */

public class Informa {
  private static boolean resultado;

  /**
   * Informa o resultado com base na nota total.
   * @param notaTotal A nota total calculada.
   */

  public static void resultado(double notaTotal) {
    int somaDosPesos = 100;
    double notaFinal = Calcular.notaFinal(notaTotal, somaDosPesos);
    int notaMinima = 85;
    resultado = Verifica.resultado(notaFinal, notaMinima);

    if (resultado) {
      System.out.println("Parabéns! Você alcançou "
          + notaFinal + "%. E temos o prazer de que você obteve aprovação! ");
    } else {
      System.out.println("Lamentamos informar que, "
          + "com base na sua pontuação alcançada neste período, "
          + notaFinal + "%. Você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }

  /**
   * Verifica se o resultado é positivo.
   * @return Verdadeiro se o resultado for positivo, falso caso contrário.
   */

  public static boolean isResultado() {
    return resultado;
  }
}
