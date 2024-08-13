package com.accenture.academico.Acc.Bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentacaoController {

	@GetMapping("/")
    public String documentacao(Model model) {
        // Adicione quaisquer dados ao modelo se necessário
        return "documentacao";
    }
}
