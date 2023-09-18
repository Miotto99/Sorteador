package com.example.demo.Model;

public class M_Sorteio {
    private int quantosNumeros;
    private int numeroMaximo;
    private int numeroMinimo;
    private int[] resultados;

    public M_Sorteio(int quantosNumeros, int[] resultados, int numeroMinimo, int numeroMaximo) {
        this.quantosNumeros = quantosNumeros;
        this.resultados = resultados;
        this.numeroMinimo = numeroMinimo;
        this.numeroMaximo = numeroMaximo;
    }

    public int getQuantosNumeros() {
        return quantosNumeros;
    }

    public void setQuantosNumeros(int quantosNumeros) {
        this.quantosNumeros = quantosNumeros;
    }

    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(int numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    public int[] getResultados() {
        return resultados;
    }

    public void setResultados(int[] resultados) {
    }
}
