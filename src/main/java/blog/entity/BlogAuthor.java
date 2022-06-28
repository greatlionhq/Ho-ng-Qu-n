package blog.entity;

public class BlogAuthor {
	private Integer id;
	private String displayName;
	private String firstName;
	private String lastName;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public void CopyData(BlogAuthor param) {
		this.id = param.getId();
		this.displayName = param.getDisplayName();
		this.firstName = param.getFirstName();
		this.lastName = param.getLastName();
	}
	
}
