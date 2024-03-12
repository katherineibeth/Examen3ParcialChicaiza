import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final ProductosRestService empresasRestService;


    public EmpresaService(EmpresasRestService productoRestServiceRestService) {
        this.productoRestService = productoRestServiceRestService;
    }


    public ResponseEntity<String> crear(){
        return this.productoRestService.crearproducto();
    }

    public ResponseEntity<String> modificar(){
        return this.productoRestService.modificarProducto();
    }

    public ResponseEntity<String> obtener(){
        return this.productoRestService.obtenerPorId();
    }
    
}
