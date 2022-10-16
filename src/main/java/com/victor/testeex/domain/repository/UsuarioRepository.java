package com.victor.testeex.domain.repository;


import com.victor.testeex.domain.model.ClienteModel;
import com.victor.testeex.domain.model.EnderecoModel;
import org.springframework.stereotype.Repository;

//Salva os dados no Banco de Dados.

@Repository
public class UsuarioRepository {

    public void salvarCliente(ClienteModel clienteModel){

        var insertTabel = "Insert into cliente (nome , cpf) value()";
        System.out.println("Cliente inserido com Sucesso");

    }

    public void salvarEndereco(EnderecoModel enderecoModel){

        var insertTabel = "Insert into endereco (nome , cpf) value()";
        System.out.println("Endereco inserido com Sucesso");

    }


}
