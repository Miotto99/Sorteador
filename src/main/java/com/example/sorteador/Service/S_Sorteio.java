package com.example.sorteador.Service;

import com.example.sorteador.Model.M_Resultado;

import java.util.Random;

public class S_Sorteio {
    public static M_Resultado Jogada(int qtdNum, int numMin, int numMax) {
        int result;
        Random random = new Random();
        int valores[] = new int[qtdNum];
        for (int i = 0; i < qtdNum; i++) {
            result = random.nextInt(numMax) + 1;
        }
        M_Resultado m_jogada = new M_Resultado(qtdNum, valores);
        return m_jogada;
    }
}
