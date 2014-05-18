package com.trekmaps.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("data")
public class QueryProcessor {

	  @GET
	  @Path("all")
	  @Produces(MediaType.APPLICATION_JSON)
	  public String queryUsers() {

		  String result = "{ name : \"Sachin\", surname : \"Patil\" }" ;

		  return result;
	  }
	  
/*	  @GET
	  @Path("places")
	  @Produces(MediaType.APPLICATION_JSON)
	  public String queryPlaces(@QueryParam("type") String type )
	  {
		  
		  if ( null == type || type.isEmpty()  )
		  {
			  return "[]" ;
		  }
		  
		  if ( type.equals("All") )
		  {
			  type = "" ;
		  }
		  
		  SelectQuery query = new SelectQuery();
		  String result = query.getPlaces(type);
		  
		  return result ;
	  }
*/
}
