package com.example.sorteador.Model;

public class M_Resultado {
    private int qtdNum;
    private int[] resultados;

    public M_Resultado(int qtdNum, int[] resultados) {
        this.qtdNum = qtdNum;
        this.resultados = resultados;
    }

    public int getQtdNum() {
        return qtdNum;
    }

    public int[] getResultados() {
        return resultados;
    }
}
