package com.victor.testeex.rest.controller;


import com.victor.testeex.domain.service.UsuarioService;
import com.victor.testeex.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//testando
@RestController
@RequestMapping("/v1")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/cadastro")
    public String getcadastro(){
        return "Cadastre o usuario em /usuario";
    }

    @PostMapping("/usuario")
    public String salvarUsuario(@RequestBody UsuarioDto usuarioDto){

        usuarioService.salvar(usuarioDto);
        //esse metodo da classe UsuarioService , faz o trabalho da conversao , para nao fazer
        // aqui no controller.

        System.out.println(usuarioDto.toString());
        return "Usuário Salvo com sucesso!";
    }

//    @GetMapping("/usuario")
//    public UsuarioDto buscarUsuario() {
//        UsuarioDto usuarioDtoLocalizadoPeloCpf = usuarioService.buscarUsuario("cpf");
//        return usuarioDtoLocalizadoPeloCpf;
//    }


}

//{
//        "nome":"Victor",
//        "cpf" : "41965910866",
//        "rua" : "Servidao Nova Esperanca",
//        "cidade" : "Florianopolis",
//        "cep" : "88063-037",
//        "estado" : "Santa Catarina"
//
//        }