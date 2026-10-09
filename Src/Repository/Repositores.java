package Repository;

import Model.Classes.Product;
import Model.interfaces.Storage_StoreEazyDB_Interface;

import java.util.List;

public abstract class Repositores implements Storage_StoreEazyDB_Interface {
    @Override
    public boolean cadastrar() {
        //criação do produto, inserção no banco de dados e validação
        return false;
    }

    @Override
    public boolean editar() {
        //edição do produto e confirmação
        return false;
    }

    @Override
    public boolean excluir() {
        //exclusão e validação
        return false;
    }

    @Override
    public Product buscarPorID() {
        //validação de existencia e mostragem
        return null;
    }

    @Override
    public List<Product> listarProdutos() {
        //mostragem completa
        return List.of();
    }
}
