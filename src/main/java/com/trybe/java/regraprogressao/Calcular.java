package com.trybe.java.regraprogressao;

import java.util.ArrayList;

/**
 * Realiza cálculos relacionados às atividades, como calcular a nota final.
 */

public class Calcular {
  private final ArrayList<Atividade> atividades;
  private double somaDosPesos;

  public Calcular(ArrayList<Atividade> atividades) {
    this.atividades = atividades;
  }

  public double getSomaDosPesos() {
    return somaDosPesos;
  }

  /**
   * Calcula a nota final com base nas notas e pesos das atividades.
   * @param somaDasNotas Soma das notas das atividades.
   * @param somaDosPesos Soma dos pesos das atividades.
   * @return A nota final calculada.
   */

  public static double notaFinal(double somaDasNotas, double somaDosPesos) {
    if (somaDosPesos != 0) {
      return somaDasNotas / somaDosPesos;
    } else {
      return Double.NaN;
    }
  }

  private double calcularNota(double nota, double peso) {
    return nota * peso;
  }

  /**
   * Realiza como calcular a nota final.
   */

  public double calcularNotas() {
    double somaDasNotas = 0;
    somaDosPesos = 0;

    for (Atividade atividade : atividades) {
      somaDasNotas += calcularNota(atividade.getNota(), atividade.getPeso());
      somaDosPesos += atividade.getPeso();
    }
    return notaFinal(somaDasNotas, somaDosPesos);
  }
}
