package com.cibertec.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cibertec.entity.Cliente;
import com.cibertec.cibertec.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository repository;
    
    @Override
    public List<Cliente> listaCliente() {
            return repository.findAll();
    }

    @Override
    public Cliente saveCliente(Cliente obj) {
        repository.save(obj);
        return obj;
    }

    @Override
    public void deleteCliente(int id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Cliente> obtenerID(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Cliente> listaClientePorNombre(String nombres) {
        return repository.findByNombresLike(nombres);
    }

    @Override
    public List<Cliente> listaClientePorDni(String dni) {
        return repository.findByDni(dni);
    }

    @Override
    public List<Cliente> listaClientePorDniNombre(String dni, String nombres) {
        return repository.findByDniAndNombres(dni, nombres);
    }
    
}
