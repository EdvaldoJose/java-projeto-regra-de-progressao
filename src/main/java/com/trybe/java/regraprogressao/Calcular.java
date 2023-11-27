package com.trybe.java.regraprogressao;

import java.util.ArrayList;

public class Calcular {

  public final ArrayList<Atividade> atividades;

  /**
   * Lint horrível.
   */

  public Calcular(ArrayList<Atividade> atividades) {
    this.atividades = atividades;
  }

  /**
   * Lint horrível.
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
   * Lint horrível.
   */

  public double calcularNotas() {
    double somaDasNotas = 0;
    double somaDosPesos = 0;

    for (Atividade atividade : atividades) {
      somaDasNotas += calcularNota(atividade.getNota(), atividade.getPeso());
      somaDosPesos += atividade.getPeso();
    }
    return notaFinal(somaDasNotas, somaDosPesos);
  }
}
