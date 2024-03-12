@RestController
@RequestMapping("/api/v1/oproducto")
public class ProductoController {

    private final ProductoService oproductoService;


    public ProductoController(ProductoService oproductoService) {
        this.oproductoService = oproductoService;
    }

    @PostMapping("/productos")
    public ResponseEntity<String> crearproducto(){
        return this.oproductosService.crear();
    }

    @PutMapping("/producto/{tipoId}/{id}")
    public ResponseEntity<String> modificarProducto(@PathVariable(name = "tipoId") String tipoId, @PathVariable(name = "id") String id){
        return this.oproductoService.obtenerPorId(tipoId, id);
    }

    @GetMapping("/producto/{tipoId}/{id}")
    public ResponseEntity<String> obtenerPorId(@PathVariable(name = "tipoId") String tipoId, @PathVariable(name = "id") String id){
        return this.oproductoService.obtenerPorId(tipoId, id);
    }
}
