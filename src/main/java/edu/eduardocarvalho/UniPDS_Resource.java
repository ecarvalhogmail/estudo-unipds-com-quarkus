package edu.eduardocarvalho;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.time.LocalDateTime;

@Path("/unipds")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class UniPDS_Resource {
    private int i = 0;

    @GET
    public int getI() {
        return i;
    }

    @GET
    @Path("getIDiferentao")
    public int getIDiferentao(){
        return LocalDateTime.now().getNano();
    }

    @POST
    public void addI(int i) {
        this.i++;
    }

    @DELETE
    public void removeI() {
        this.i--;
    }

    @PUT
    public void setI(int i) {
        this.i = i;
    }
}
