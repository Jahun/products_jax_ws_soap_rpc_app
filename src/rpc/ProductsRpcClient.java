package rpc;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ceyhun Esedli on 2017-04-22.
 */
public class ProductsRpcClient {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/rpc/products");

            QName qName = new QName("http://rpc/", "ProductsService");
            Service service = Service.create(url, qName);
            IProducts products = service.getPort(IProducts.class);


            System.out.println(products.getProduct(10));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
