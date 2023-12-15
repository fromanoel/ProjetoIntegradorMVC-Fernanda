package br.edu.iftm.biblioteca.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BibliotecaController {
    @RequestMapping("/livros")
    public String livros(Model model) {
        model.addAttribute("mensagem", "");
        return "listaLivros";
    }

    @RequestMapping("/cadastroLivro")
    public String cadastrarLivro(Model model) {
        model.addAttribute("mensagem", "");
        return "cadastroLivro";
    }

    @RequestMapping("/emprestimo")
    public String emprestimo(Model model) {
        model.addAttribute("mensagem", "");
        return "emprestimo";
    }
}
