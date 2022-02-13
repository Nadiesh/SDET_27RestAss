package PojoLibrary;
public class PojoClass {
	public String CreatedBY;
	public String projectName;
	public String Status;
	public int teamsize;
	public PojoClass(String createdBY, String projectName, String status, int teamsize) {
		super();
		this.CreatedBY = createdBY;
		this.projectName = projectName;
		this.Status = status;
		this.teamsize = teamsize;
	}
	public String getCreatedBY() {
		return CreatedBY;
	}
	public void setCreatedBY(String createdBY) {
		CreatedBY = createdBY;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
	
	
	
	
	

}