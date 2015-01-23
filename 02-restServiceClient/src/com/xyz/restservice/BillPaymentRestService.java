package com.xyz.restservice;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
import com.xyz.pojo.Bill;
 
@Path("restservice/1.0")
@Produces("application/xml")
public interface BillPaymentRestService {
 //parameter that gets passed via the URL
 @GET
 @Path("/bill/{accountID}")
 Bill getBill(@PathParam("accountID") String accountID);
}