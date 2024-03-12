import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final ProductosRestService empresasRestService;


    public EmpresaService(EmpresasRestService productoRestServiceRestService) {
        this.productoRestService = productoRestServiceRestService;
    }


    public ResponseEntity<String> prueba(){
        return this.productoRestService.crearproducto();
    }
    
}
