package com.victor.testeex.domain.repository;

import com.victor.testeex.domain.model.ClienteModel;
import com.victor.testeex.domain.model.EnderecoModel;
import com.victor.testeex.domain.model.ProdutoEmpModel;
import com.victor.testeex.domain.model.ProdutoModel;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {

    public void salvarProduto(ProdutoModel produtoModel){

        var insertTabel = "Insert into produto (nomeProduto , tipoProduto) value()";
        System.out.println("Produto inserido com Sucesso");

    }

    public void salvarEmpresaProduto(ProdutoEmpModel produtoEmpModel){

        var insertTabel = "Insert into empresa ( cnpj , nomeFantasia) value()";
        System.out.println("Empresa do Produto inserido com Sucesso");

    }

}
