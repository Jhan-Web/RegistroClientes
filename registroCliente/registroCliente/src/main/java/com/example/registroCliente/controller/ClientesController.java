package com.example.registroCliente.controller;

import com.example.registroCliente.model.Clientes;
import com.example.registroCliente.modelentidades.ClienteEntidad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientesController {

    Clientes objCLi = new Clientes();

    @GetMapping({"/index","/"})
    public String index(Model model){
        return "FormularioRegistro";
    }

    @PostMapping("/Registrar")
    public String registrarCliente(@Validated ClienteEntidad cliente){
        if (cliente != null){
            objCLi.registrarCliente(cliente);
        }
        return "FormularioRegistro";
    }

    @GetMapping("/Lista")
    public String getLista(Model model){
        List<ClienteEntidad> listaCli = new ArrayList<>();
        listaCli = objCLi.getClientes();
        model.addAttribute("listaA", listaCli);
        return "FormularioListaClientes";
    }

    @GetMapping("/listaporCasado")
    public String getListaporCasado(Model model){
        List<ClienteEntidad> listaCasados = new ArrayList<>();
        listaCasados = objCLi.getClientesCasados();
        model.addAttribute("listaCasados", listaCasados);
        return "FormularioListaCasados";
    }

    @GetMapping("/listaporCodigoPostal")
    public String getListaporCodigoPostal(Model model){
        List<ClienteEntidad> listaPorCodigoPostal = new ArrayList<>();
        listaPorCodigoPostal = objCLi.getClientesPorCodigoPostal();
        model.addAttribute("listaPorCodigoPostal", listaPorCodigoPostal);
        return "FormularioListaCodigoPostal";
    }

}
