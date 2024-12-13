package br.edu.ifpr.pgua.eic.tads.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifpr.pgua.eic.tads.models.Cadastro;
import br.edu.ifpr.pgua.eic.tads.models.Pessoa;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class ListaController {
    private Cadastro cadastro;
    
    public ListaController(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Handler get = (Context ctx) -> {        
        List<Pessoa> contatos = this.cadastro.getPessoas();

        Map<String, Object> dados = new HashMap<>();

        dados.put("contatos", contatos);
        ctx.render("lista.html", dados);
    };
}
