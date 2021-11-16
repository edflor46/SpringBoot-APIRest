package com.edflor.springboot.backend.apirest.models.dao;

import com.edflor.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {



}
