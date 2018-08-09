package com.rahulruben.school.services;

import java.util.Map;

import com.rahulruben.school.connection.ClassDatabase;
import com.rahulruben.school.models.ClassRoom;

public class ClassService {
	protected ClassDatabase connect = new ClassDatabase();
	
	public Map<Integer, ClassRoom> getClassRooms() {
		return connect.getClassRooms();
	}
	
	public ClassRoom getClassRoom(int classRoomId) {
		return connect.getClassRoom(classRoomId);
	}
	
	public ClassRoom addClassRoom(ClassRoom classRoom) {
		return connect.addClassRoom(classRoom);
	}
	
	public ClassRoom updateClassRoom(int classRoomId, ClassRoom classRoom) {
		return connect.updateClassRoom(classRoomId, classRoom);
	}
	
	public ClassRoom removeClassRoom(int classRoomId) {
		return connect.removeClassRoom(classRoomId);
	}
}
