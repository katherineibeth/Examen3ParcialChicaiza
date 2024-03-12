import org.springframework.stereotype.Service;

@Service
public class ProductoRestService {
    private final RestTemplate restTemplate; 

    public ProductoRestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    
    public ResponseEntity<String> obtenerPorId(String id) {
        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:8081/api/v1/producto")
                .path("/{id}")
                .buildAndExpand(id)
                .toUriString();
        return restTemplate.getForEntity(url, String.class);
    }

    public ResponseEntity<String> crearproducto(String numeroIdentificacion) {
        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:8081/api/v1/empresas")
                .path("/ruc/{numeroIdentificacion}")
                .buildAndExpand(numeroIdentificacion)
                .toUriString();
        return restTemplate.getForEntity(url, String.class);
    }

    public ResponseEntity<String> modificarProducto(String idProducto) {
        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:8081/api/v1/empresas")
                .path("/modificar/{idProducto}")
                .buildAndExpand(idProducto)
                .toUriString();
        restTemplate.put(url, null);
        return ResponseEntity.noContent().build();
    }


}
