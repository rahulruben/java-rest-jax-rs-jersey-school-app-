package com.rahulruben.school.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rahulruben.school.models.Student;
import com.rahulruben.school.services.ClassService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {
	
	private ClassService service = ClassResource.getClassService();
		
	@GET
	public List<Student> getAllStudents(@PathParam("classRoomId") int classRoomId) {	
		return service.getClassRoom(classRoomId).getStudents();
	}
	
}
