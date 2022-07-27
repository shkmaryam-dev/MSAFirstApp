package com.maryam.msasecondapp.service;

import ejb.BookSessionBean;
import entity.Book;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/example")
public class ExampleService {
    @Inject BookSessionBean db;
    
    @RolesAllowed("Admin")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String SayHello() {
        return "Hello, world! from M.Sc.(I.C.T.)";
    }
    
    @RolesAllowed("Admin")
    @GET
    @Path("/getAllBooks")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> Books() {
      return  db.getAllBooks();
    }
   
    

}
