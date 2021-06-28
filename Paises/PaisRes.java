import javax.ws.rs.GET;

@Path("/test")

public class PairRes{

@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/res")

public String hola(){
    return "Paises";

 }
 @GET
 @Produces(MediaType.APPICATION_JSON)
 @0Path("get-Paises")
public Paises getPais(){
    Paises pais = new Pais();
    pais.setNombre("Dinamarca");
    pais.setCapital("Region Capital");
    pais.setKm(42,933);
    pais.setContinente("Europa");

    return pais;
}

}