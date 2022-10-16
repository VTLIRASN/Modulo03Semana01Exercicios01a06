package com.victor.testeex.domain.service;

import com.victor.testeex.domain.model.ClienteModel;
import com.victor.testeex.domain.model.EnderecoModel;
import com.victor.testeex.domain.repository.UsuarioRepository;
import com.victor.testeex.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void salvar(UsuarioDto usuarioDto){

        ClienteModel clienteModel = new ClienteModel();
        //Criando objeto da classe ClienteModel,
        // nao poderia utilizar o @Autowired por conta de nao haver nenhum
        // @service ou @Repository em cima da classe.
        clienteModel.setNome(usuarioDto.getNome());
        clienteModel.setCpf(usuarioDto.getCpf());
        String statusdoCliente = buscarStatusClietenoSerasa(usuarioDto.getCpf());
        clienteModel.setStatusCliente(statusdoCliente);
        usuarioRepository.salvarCliente(clienteModel);
        System.out.println(clienteModel.toString());


        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setCep(usuarioDto.getCep());
        enderecoModel.setCidade(usuarioDto.getCidade());
        enderecoModel.setEstado(usuarioDto.getEstado());
        enderecoModel.setRua(usuarioDto.getRua());
        usuarioRepository.salvarEndereco(enderecoModel);

        System.out.println("Cliente e Endereco Salvo com sucesso");

    }

    private String buscarStatusClietenoSerasa(String cpf){
        //requisição para a API do Serasa;

        return "Bom";

    }
}
