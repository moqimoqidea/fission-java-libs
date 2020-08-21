package io.fission;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.container.ContainerRequestContext;

public interface Function<ContainerRequestContext, Response> {
	
	Response call(ContainerRequestContext req, Context context);

}
