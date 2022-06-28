package blog.entity;

public class BlogUserDetail {
	private Integer userId;
	private String phoneNumber;
	private String website;
	private String userPicture;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getUserPicture() {
		return userPicture;
	}
	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}
	
	public void CopyData(BlogUserDetail param) {
		this.userId = param.getUserId();
	     this.phoneNumber = param.getPhoneNumber();
	     this.website = param.getWebsite();
	     this.userPicture = param.getUserPicture();
	}
	
}
