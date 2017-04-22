package rpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Ceyhun Esedli on 2017-04-22.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IProducts {

    @WebMethod
    String getProduct(Integer id);
}
