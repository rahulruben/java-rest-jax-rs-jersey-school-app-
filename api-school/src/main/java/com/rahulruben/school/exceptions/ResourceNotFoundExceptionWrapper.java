package com.rahulruben.school.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.rahulruben.school.models.ResourceError;

@Provider
public class ResourceNotFoundExceptionWrapper implements ExceptionMapper<ResourceNotFoundException>{

	@Override
	public Response toResponse(ResourceNotFoundException ex) {
		ResourceError error = new ResourceError(ex.getMessage(), 404);
		return Response.status(Status.NOT_FOUND)
				.entity(error)
				.build();
	}

}
