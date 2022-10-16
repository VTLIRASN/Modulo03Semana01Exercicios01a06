package com.victor.testeex.rest.controller;

import com.victor.testeex.domain.model.ClienteModel;
import com.victor.testeex.domain.model.EnderecoModel;
import com.victor.testeex.domain.model.ProdutoModel;
import com.victor.testeex.domain.service.ProdutoService;
import com.victor.testeex.rest.dto.ProdutoDto;
import com.victor.testeex.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping("/produto")
    public String salvarProduto(@RequestBody ProdutoDto produtoDto){

        produtoService.salvar(produtoDto);
        //esse metodo da classe UsuarioService , faz o trabalho da conversao , para nao fazer
        // aqui no controller.

        System.out.println(produtoDto.toString());
        return "Produto Salvo com sucesso!";
    }

}

//{
//        "nomeProduto":"detergente",
//        "tipoProduto" : "limpeza",
//        "cnpj" : "8273621152/0001-52",
//        "nomeFantasia" : "Limpol"
//
//        }
