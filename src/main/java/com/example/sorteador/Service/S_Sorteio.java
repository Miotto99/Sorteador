package com.example.demo.Service;

import com.example.demo.Model.M_Sorteio;

import java.util.Random;

public class S_Sorteio {
    public static M_Sorteio Sorteador(int quantosNumeros, int numeroMinimo, int numeroMaximo){
        int resultados[] = new int[quantosNumeros];

        for (int i = 0; i < quantosNumeros; i++) {
            int randomNum;
            do {
                randomNum = (int) Math.floor(Math.random() * ((numeroMaximo+1) - numeroMinimo) + numeroMinimo);
            } while (randomNum < numeroMinimo);
            resultados[i] = randomNum;
        }

        M_Sorteio m_sorteio = new M_Sorteio(quantosNumeros, resultados, numeroMinimo, numeroMaximo);
        return m_sorteio;
    }
}
