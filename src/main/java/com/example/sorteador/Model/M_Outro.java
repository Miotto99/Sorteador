package com.example.sorteador.Model;


public class M_Outro {
    private int numMin;
    private int numMax;
    private int qtdNum;

    public M_Outro(int numMin, int numMax, int qtdNum) {
        this.numMin = numMin;
        this.numMax = numMax;
        this.qtdNum = qtdNum;
    }

    public int getNumMin() {
        return numMin;
    }

    public int getNumMax() {
        return numMax;
    }

    public int getQtdNum() {
        return qtdNum;
    }
}