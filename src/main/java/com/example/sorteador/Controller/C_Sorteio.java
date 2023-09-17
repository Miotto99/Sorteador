package com.example.demo.Controller;

import com.example.demo.Model.M_Sorteio;
import com.example.demo.Service.S_Sorteio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class C_Sorteio {

    @GetMapping("/")
    public String getpag(){
        return "index";
    }

    @PostMapping("/")
    public String postRepost(@RequestParam("quantosNumeros") int quantosNumeros,
                             @RequestParam("numeroMinimo") int numeroMinimo,
                             @RequestParam("numeroMaximo") int numeroMaximo,
                             Model model){
        M_Sorteio m_sorteio = S_Sorteio.Sorteador(quantosNumeros,numeroMinimo,numeroMaximo);
        model.addAttribute("quantosNumeros", m_sorteio.getQuantosNumeros());
        model.addAttribute("Minimo", m_sorteio.getNumeroMinimo());
        model.addAttribute("Maximo", m_sorteio.getNumeroMaximo());
        model.addAttribute("Resultados", m_sorteio.getResultados());
        return "index";
    }
}
