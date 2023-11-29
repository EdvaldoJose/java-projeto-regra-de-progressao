package com.trybe.java.regraprogressao;

/**
 * Representa uma atividade com nome, peso e nota.
 */

public class Atividade {
  private String nome;
  private int peso;
  private double nota;

  /**
   * Obtém o nome da atividade.
   *
   */
  public Atividade(String nome, int peso, double nota) {
    this.nome = nome;
    this.peso = peso;
    this.nota = nota;
  }

  /**
   * Obtém o nome.
   * @return.
   */

  public String getNome() {
    return nome;
  }

  public int getPeso() {
    return peso;
  }

  public double getNota() {
    return nota;
  }

  // Removido o método add(Atividade atividade) pois não está sendo utilizado.
}
