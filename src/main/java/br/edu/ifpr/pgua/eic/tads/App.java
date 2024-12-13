package br.edu.ifpr.pgua.eic.tads;

import br.edu.ifpr.pgua.eic.tads.controllers.CadastroController;
import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.controllers.ListaController;
import br.edu.ifpr.pgua.eic.tads.models.Cadastro;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        var app = JavalinUtils.makeApp(7070);
        
        Cadastro cadastro = new Cadastro();

        IndexController indexController = new IndexController();
        CadastroController cadastroController = new CadastroController(cadastro);
        ListaController listaController = new ListaController(cadastro);

        app.get("/", indexController.get);
        app.get("/ola",indexController.ola);

        app.get("/cadastro",cadastroController.get);
        app.post("/cadastro",cadastroController.post);
        
        app.get("/contatos",listaController.get);
    }
}
