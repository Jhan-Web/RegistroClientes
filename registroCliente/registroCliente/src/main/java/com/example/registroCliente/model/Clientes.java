package com.example.registroCliente.model;

import com.example.registroCliente.modelentidades.ClienteEntidad;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

    private final List<ClienteEntidad> listaCli = new ArrayList<>();

    public void registrarCliente(ClienteEntidad objAe) {
        listaCli.add(objAe);
    }

    public List<ClienteEntidad> getClientes() {
        return listaCli;
    }

    // Filtrar clientes por estado civil "Casado"
    public List<ClienteEntidad> getClientesCasados() {
        List<ClienteEntidad> clientesCasados = new ArrayList<>();
        for (ClienteEntidad cliente : listaCli) {
            if (cliente.getEstado_civil().equalsIgnoreCase("Casado")) {
                clientesCasados.add(cliente);
            }
        }
        return clientesCasados;
    }

    // Filtrar clientes por código postal "05000"
    public List<ClienteEntidad> getClientesPorCodigoPostal() {
        List<ClienteEntidad> clientesPorCodigoPostal = new ArrayList<>();
        for (ClienteEntidad cliente : listaCli) {
            if (cliente.getCodigo_postal().equals("05000")) {
                clientesPorCodigoPostal.add(cliente);
            }
        }
        return clientesPorCodigoPostal;
    }
}
