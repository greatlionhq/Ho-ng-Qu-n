package blog.entity;

public class BlogPostToCategory {
	private Integer categoryId;
	private Integer postId;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	
	public void CopyData(BlogPostToCategory param) {
		this.categoryId = param.getCategoryId();
		this.postId = param.getPostId();
	}
	
	
}
