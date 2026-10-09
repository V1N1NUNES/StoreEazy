package Model.interfaces;

import Model.Classes.Product;

import java.util.List;

public interface Storage_StoreEazyDB_Interface {
    boolean cadastrar();
    boolean editar();
    boolean excluir();
    Product buscarPorID();
    List<Product> listarProdutos();
}
