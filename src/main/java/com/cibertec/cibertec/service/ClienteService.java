package com.cibertec.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.cibertec.entity.Cliente;

public interface ClienteService {
    

    public abstract List<Cliente> listaCliente();
    public abstract Cliente saveCliente(Cliente obj);
    public abstract void deleteCliente(int id);
    public abstract Optional<Cliente> obtenerID(int id);

    public abstract List<Cliente> listaClientePorNombre(String nombres);
    public abstract List<Cliente> listaClientePorDni(String dni);
    public abstract List<Cliente> listaClientePorDniNombre(String dni, String nombres);

}
