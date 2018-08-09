package com.rahulruben.school.connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.rahulruben.school.models.ClassRoom;
import com.rahulruben.school.models.Student;

public class ClassDatabase {
	private static Map<Integer, ClassRoom> classRooms = new HashMap<Integer, ClassRoom>();
	
	static {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "John", "Snow", "Herbert"));
		students.add(new Student(2, "Tintin", "NA", "NA"));
		students.add(new Student(3, "Brad", "Pitt", "NA"));
		
		classRooms.put(1, new ClassRoom(students, "Sulabha Mule", "B"));
	}
	
	public ClassDatabase() {
		
	}
	
	public Map<Integer, ClassRoom> getClassRooms() {
		return classRooms;
	}
	
	public ClassRoom getClassRoom(int classRoomId) {
		return classRooms.get(classRoomId);
	}
	
	public ClassRoom addClassRoom(ClassRoom classRoom) {
		return classRooms.put(classRooms.size() + 1, classRoom);
	}
	
	public ClassRoom updateClassRoom(int classRoomId, ClassRoom classRoom) {
		if (classRooms.containsKey(classRoomId)) {
			return classRooms.put(classRoomId, classRoom);
		}
		return null;
	}
	
	public ClassRoom removeClassRoom(int classRoomId) {
		return classRooms.remove(classRoomId);
	}
}
