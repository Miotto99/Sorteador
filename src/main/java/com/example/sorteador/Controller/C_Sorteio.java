package com.example.sorteador.Controller;

import com.example.sorteador.Service.S_Sorteio;
import com.example.sorteador.Model.M_Sorteio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class C_Sorteio {

    @GetMapping("/")
    public String getpag(){
        return "index";
    }

    @PostMapping("/")
    @ResponseBody
    public int[] postRepost(@RequestParam("quantosNumeros") int quantosNumeros,
                             @RequestParam("numeroMinimo") int numeroMinimo,
                             @RequestParam("numeroMaximo") int numeroMaximo,
                             @RequestParam("repetir") boolean repetir,
                             @RequestParam("ordem") boolean ordem,
                             Model model){
        return S_Sorteio.Sorteador(quantosNumeros,numeroMinimo,numeroMaximo,repetir,ordem);
    }
}
