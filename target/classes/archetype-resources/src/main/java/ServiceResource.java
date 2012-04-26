#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.springframework.context.annotation.Scope;

import uk.ac.dotrural.irp.ecosystem.core.models.jaxb.system.EndpointInfo;
import uk.ac.dotrural.irp.ecosystem.core.models.jaxb.system.Query;
import uk.ac.dotrural.irp.ecosystem.core.models.jaxb.system.ServiceInitialiser;
import uk.ac.dotrural.irp.ecosystem.core.models.jaxb.system.SystemMessage;
import uk.ac.dotrural.irp.ecosystem.core.resources.RESTFulSPARQL;
import uk.ac.dotrural.irp.ecosystem.core.services.SPARQLEndpoint;
import uk.ac.dotrural.irp.ecosystem.core.util.Util;

@Path("/${artifactId}")
@Scope("request")
public class ${artifactId}Resource implements RESTFulSPARQL {

	@Context
	private UriInfo uriInfo;
	
	private SPARQLEndpoint ${artifactId}Endpoint;

	public void setServiceEndpoint(SPARQLEndpoint ${artifactId}Endpoint) {
		this.${artifactId}Endpoint = ${artifactId}Endpoint;
	}

	public SystemMessage init(ServiceInitialiser si) {
		return ${artifactId}Endpoint.init(uriInfo, si);
	}

	public void update(Query query) {
		${artifactId}Endpoint.update(query);
	}

	public String query(Query query) {
		return Util.resultsetToString(${artifactId}Endpoint.query(query));
	}

	public EndpointInfo info() {
		return ${artifactId}Endpoint.info();
	}
	
	@POST
	@Path("create")
	public void create(){
		// TODO incomplete method
	}
	
	@GET
	@Path("get")
	public Object get(){
		// TODO incomplete method
		return null;
	}

	@DELETE
	@Path("delele")
	public void delete(){
		// TODO incomplete method
	}

	@PUT
	@Path("update")
	public void update(){
		// TODO incomplete method
	}
}
