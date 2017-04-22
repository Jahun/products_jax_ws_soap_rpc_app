package rpc;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Ceyhun Esedli on 2017-04-22.
 */

@WebService(endpointInterface = "rpc.IProducts")
public class Products implements IProducts{


  @Override
  public String getProduct(Integer id) {
    return "Product : " + id.toString();
  }
}
