
package com.portfolio.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("nome", "Danilo Arroio Oliveira");
        model.addAttribute("curso", "Sistemas de Informação");
        model.addAttribute("descricao", "Sou estudante e estou aprendendo desenvolvimento web.");

        return "index";
    }
}
