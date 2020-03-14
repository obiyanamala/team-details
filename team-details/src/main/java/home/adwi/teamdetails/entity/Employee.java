package home.adwi.teamdetails.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String designation;
	/*
	 * private String skills; private String imageUrl; private boolean active;
	 * private int experience; private Date joinedOn;
	 */
	
	public Employee() {}
	public Employee(long id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/*
	 * public String getSkills() { return skills; } public void setSkills(String
	 * skills) { this.skills = skills; } public String getImageUrl() { return
	 * imageUrl; } public void setImageUrl(String imageUrl) { this.imageUrl =
	 * imageUrl; } public boolean isActive() { return active; } public void
	 * setActive(boolean active) { this.active = active; } public int
	 * getExperience() { return experience; } public void setExperience(int
	 * experience) { this.experience = experience; } public Date getJoinedOn() {
	 * return joinedOn; } public void setJoinedOn(Date joinedOn) { this.joinedOn =
	 * joinedOn; }
	 */
	
}
