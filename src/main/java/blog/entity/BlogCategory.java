package blog.entity;

import java.sql.Timestamp;

public class BlogCategory {
	private Integer id;
	private String name;
	private String nameClean;
	private Boolean enabled;
	private Timestamp dateCreated;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameClean() {
		return nameClean;
	}
	public void setNameClean(String nameClean) {
		this.nameClean = nameClean;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public void CopyData (BlogCategory param) {
		this.id = param.getId();
		this.name = param.getName();
		this.nameClean = param.getNameClean();
		this.enabled = param.getEnabled();
		this.dateCreated = param.getDateCreated();
	}
}	
