package com.victor.testeex.domain.service;

import com.victor.testeex.domain.model.EnderecoModel;
import com.victor.testeex.domain.model.ProdutoEmpModel;
import com.victor.testeex.domain.model.ProdutoModel;
import com.victor.testeex.domain.repository.ProdutoRepository;
import com.victor.testeex.rest.dto.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public void salvar(ProdutoDto produtoDto){

        ProdutoModel produtoModel = new ProdutoModel();
        //Criando objeto da classe ProdutoModel,
        // nao poderia utilizar o @Autowired por conta de nao haver nenhum
        // @service ou @Repository em cima da classe.
        produtoModel.setNomeProduto(produtoDto.getNomeProduto());
        produtoModel.setTipoProduto(produtoDto.getTipoProduto());
        produtoRepository.salvarProduto(produtoModel);
        System.out.println(produtoModel.toString());


        ProdutoEmpModel produtoEmpModel = new ProdutoEmpModel();
        produtoEmpModel.setNomeFantasia(produtoDto.getNomeFantasia());
        produtoEmpModel.setCnpj(produtoDto.getCnpj());
        produtoRepository.salvarEmpresaProduto(produtoEmpModel);

        System.out.println("Cliente e Endereco Salvo com sucesso");

    }

}
