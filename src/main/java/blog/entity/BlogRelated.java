package blog.entity;


public class BlogRelated {
	private Integer blogPostId;
	private Integer blogRelatedPostId;
	public Integer getBlogPostId() {
		return blogPostId;
	}
	public void setBlogPostId(Integer blogPostId) {
		this.blogPostId = blogPostId;
	}
	public Integer getBlogRelatedPostId() {
		return blogRelatedPostId;
	}
	public void setBlogRelatedPostId(Integer blogRelatedPostId) {
		this.blogRelatedPostId = blogRelatedPostId;
	}
	
	public void CopyData(BlogRelated param)
	 {
	     this.blogPostId = param.getBlogPostId();
	     this.blogRelatedPostId = param.getBlogRelatedPostId();
	 }
}
