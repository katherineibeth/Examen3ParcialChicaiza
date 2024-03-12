@Getter
@Setter
@NoArgsConstructor
public class Producto {

    @Id
    private String id;

    @Indexed(unique = true)
    @Field("idproducto")
    private String idproducto;

    @Field("nombre")
    private String nombre;

    @Field("descripcion")
    private String descripcion;

    @Field("precio")
    private long precio;

    @Field("existencia")
    private long existencia;


    
}
