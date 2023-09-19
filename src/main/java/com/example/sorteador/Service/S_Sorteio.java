package com.example.sorteador.Service;

import com.example.sorteador.Model.M_Sorteio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Arrays;

public class S_Sorteio {
    public static int[] Sorteador(int quantosNumeros, int numeroMinimo, int numeroMaximo, boolean repetir, boolean ordem) {
        int resultados[] = new int[quantosNumeros];

        for (int i = 0; i < quantosNumeros; i++) {
            int randomNum;
            if (repetir) {
                boolean repetiu;
                do {
                    randomNum = (int) Math.floor(Math.random() * ((numeroMaximo + 1) - numeroMinimo) + numeroMinimo);
                    int finalRandomNum = randomNum;
                    repetiu = Arrays.stream(resultados).anyMatch(elemento -> elemento == finalRandomNum);
                } while (repetiu);
            } else {
                randomNum = (int) Math.floor(Math.random() * ((numeroMaximo + 1) - numeroMinimo) + numeroMinimo);
            }
            resultados[i] = randomNum;
        }

        if (ordem) {
            Arrays.sort(resultados);
        }
        M_Sorteio m_sorteio = new M_Sorteio(quantosNumeros, resultados, numeroMinimo, numeroMaximo);
        return resultados;
    }
    public static String String(){
        Date data = new Date();

        SimpleDateFormat formato = new SimpleDateFormat(
                "dd 'de' MM 'de' yyyy, HH:mm",
                new Locale("pt", "BR")
        );

        String dataFormatada = formato.format(data);
        return dataFormatada;
    }
}
