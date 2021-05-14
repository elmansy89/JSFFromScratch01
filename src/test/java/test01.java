import Wrapper.IdNameWrapper;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


public class test01 {


    public static void main(String[] args) {
        List<IdNameWrapper> responseIdNameWrapper;
        ClientConfig config = new ClientConfig();
        config.register(JacksonFeature.class);
        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target("http://localhost:8888");

        responseIdNameWrapper = target.path("student")
                .path("getAllStudentsWrapper").request()
                .accept(MediaType.APPLICATION_JSON)
                .get(Response.class).readEntity(new GenericType<List<IdNameWrapper>>() {
                });
      System.out.println( responseIdNameWrapper.get(0).getName());
    }

}

