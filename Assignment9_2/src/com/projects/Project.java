package com.projects;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/*
 * . Maintain a HashSet of projects and perform given operations in a menu-driven program. 
Ensure that projects are not duplicated by the project id in the set. 
Each project information includes int id, String title, int teamSize, double projectCost , String technology. 
1. Add Dummy Data of Projects in the Set 
2. Input a Project from user and add in Set 
3. Display all Projects in Set 
4. Delete a Project by Id from Set 
5. Copy All Projects from Set to ArrayList 
6. Display all Projects from List 
7. Sort all Projects in List by cost 
Dummy Data 
8. Find project with Max team size using Collections.max() 
- new Project(1, "Train Reservation System", 5000000, "Java") 
- new Project(2, "Airline Reservation System",3, 6000000, ".NET") 
- new Project(4, "Online Grocery Shop", 6, 3000000, "Java")
- new Project(5, "Online Book Shop", 2, 3000000, ".NET") 
- new Project(3, "Online Jewelry Shop", 4, 4000000, "Java") 
- new Project(2, "Bus Reservation System", 3, 3500000, "JS")
 * 
 */
public class Project implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id;
private String title;
private int teamSize;
private double projectCost;
private String technology;

public Project() {
	//to do
}
public Project(int id, String title, int teamSize, double projectCost, String technology) {
	this.id = id;
	this.title = title;
	this.teamSize = teamSize;
	this.projectCost = projectCost;
	this.technology = technology;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
public double getProjectCost() {
	return projectCost;
}
public void setProjectCost(double projectCost) {
	this.projectCost = projectCost;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if(obj == null)
		return false;
	if (this == obj)
		return true;
	if (!(obj instanceof Project))
		return false;
	Project other = (Project) obj;
	return id == other.id;
}
@Override
public String toString() {
	return String.format("Project [id=%s, title=%s, teamSize=%s, projectCost=%s, technology=%s]", id, title, teamSize,
			projectCost, technology);
}
}
class SortByCost implements Comparator<Project>{

	@Override
	public int compare(Project o1, Project o2) {
		return Double.compare(o1.getProjectCost(), o2.getProjectCost());
	}
	
}



