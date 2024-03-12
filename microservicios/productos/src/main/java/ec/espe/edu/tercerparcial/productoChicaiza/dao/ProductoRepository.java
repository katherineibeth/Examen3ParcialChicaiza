
public class ProductoRepository {
    Producto findByIdProducto(String idProducto);

    List<Producto> findByTipoCodigo(String id);
}
