package blog.entity;

public class BlogTag {
	private Integer id;
	private Integer postId;
	private String tag;
	private String tagClean;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTagClean() {
		return tagClean;
	}
	public void setTagClean(String tagClean) {
		this.tagClean = tagClean;
	}
	
	public void CopyData(BlogTag param) {
		this.id = param.getId();
		this.postId = param.getPostId();
		this.tag = param.getTag();
		this.tagClean = param.getTagClean();
	}
}
