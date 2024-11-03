package com.soulcode.sistemaTI.Controllers;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ChamadosController {



    @RequestMapping(value = "/criar-chamado", method = RequestMethod.GET)
    public String criarChamado(Model model, String name) {
        model.addAttribute("name", name);
        return "novo-chamado";
    }


    @RequestMapping(value = "/mostrar-chamado", method = RequestMethod.GET)
    public String criarNovoChamado(Model model, @RequestParam String nome, String setor, String descricao, String prioridade, LocalDate dataInicio) {
        model.addAttribute("name", nome);
        ChamadosModel novoChamado = new ChamadosModel(nome, setor, descricao, prioridade, dataInicio);
        model.addAttribute("chamado", novoChamado);


        return "mostrarNovoChamados";
    }


}