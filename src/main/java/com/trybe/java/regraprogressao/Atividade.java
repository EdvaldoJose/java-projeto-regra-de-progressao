package com.trybe.java.regraprogressao;

public class Atividade {
  private String nome;
  private int peso;
  private double nota; // Alteração para double

  /**
   * Lint horrível.
   */

  public Atividade(String nome, int peso, double nota) {
    this.nome = nome;
    this.peso = peso;
    this.nota = nota;
  }

  public String getNome() {
    return nome;
  }

  public int getPeso() {
    return peso;
  }

  public double getNota() {
    return nota;
  }

  public void add(Atividade atividade) {
  }
}
