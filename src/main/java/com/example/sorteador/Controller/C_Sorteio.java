package com.example.sorteador.Controller;

import com.example.sorteador.Model.M_Resultado;
import com.example.sorteador.Service.S_Sorteio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class C_Sorteio {
    @GetMapping("/")
    public String getHome(){
        return "/index";
    }
    @PostMapping("/")
    public String postHome(@RequestParam("numMin")int numMin,
                           @RequestParam("numMax")int numMax,
                           @RequestParam("qtdNum")int qtdNum,
                           Model model){
        M_Resultado jogada = S_Sorteio.Jogada(qtdNum, numMin, numMax);
        model.addAttribute("maximo", jogada.getQtdNum());
        model.addAttribute("Resultados", jogada.getResultados());
        return "/index";
    }
}