package blog.entity;



public class BlogUser {
	private Integer userId;
	private String name;
	private String email;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void CopyData(BlogUser param)
	 {
	     this.userId = param.getUserId();
	     this.name = param.getName();
	     this.email = param.getEmail();
	 }

}
