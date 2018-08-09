package com.rahulruben.school.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;
import com.rahulruben.school.exceptions.ResourceNotFoundException;
import com.rahulruben.school.models.ClassRoom;
import com.rahulruben.school.services.ClassService;

@Path("/classes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClassResource {
	
	private static ClassService service = new ClassService();
	private Gson gson = new Gson();
	
	
	public static ClassService getClassService() {
		return service;
	}
	
	@GET
	public Response getAllClassRooms() {
		return Response.status(Status.OK)
				.entity(gson.toJson(service.getClassRooms()))
				.build();
	}
	
	@GET
	@Path("/{classRoomId}")
	public ClassRoom getClassRoom(@PathParam("classRoomId") int classRoomId) {
		ClassRoom classRoom = service.getClassRoom(classRoomId);
		if(classRoom == null) {
			throw new ResourceNotFoundException("Class Room " + classRoomId + " not Found");
		}
		return classRoom; 
	}
	
	
	@Path("/{classRoomId}/students")
	public StudentResource getAllStudents() {
		return new StudentResource();
	}
	
	@POST
	public ClassRoom addClassRoom(ClassRoom classRoom) {
		return service.addClassRoom(classRoom);
	}
	
	@PUT
	@Path("/{classRoomId}")
	public ClassRoom updateClassRoom(@PathParam("classRoomId") int classRoomId, ClassRoom classRoom) {
		ClassRoom oldClassRoom = service.updateClassRoom(classRoomId, classRoom);
		if(oldClassRoom == null) {
			throw new ResourceNotFoundException("Class Room " + classRoomId + " not Found");
		}
		return classRoom;
	}
	
	@DELETE
	@Path("/{classRoomId}")
	public ClassRoom removeClassRoom(@PathParam("classRoomId") int classRoomId) {
		ClassRoom classRoom = service.removeClassRoom(classRoomId);
		if(classRoom == null) {
			throw new ResourceNotFoundException("Class Room " + classRoomId + " not Found");
		}
		return classRoom;
	}
}
