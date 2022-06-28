package blog.entity;

import java.sql.Timestamp;

public class BlogComment {
	private Integer id;
	private Integer postId;
	private Integer isReplyToId;
	private String commentContent;
	private Integer userId;
	private Boolean markRead;
	private Boolean enabled;
	private Timestamp commentDate;
	
	
	
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
	public Integer getIsReplyToId() {
		return isReplyToId;
	}
	public void setIsReplyToId(Integer isReplyToId) {
		this.isReplyToId = isReplyToId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Boolean getMarkRead() {
		return markRead;
	}
	public void setMarkRead(Boolean markRead) {
		this.markRead = markRead;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Timestamp getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Timestamp commentDate) {
		this.commentDate = commentDate;
	}
	
	public void CopyData(BlogComment param) {
		this.id = param.getId();
	     this.postId = param.getPostId();
	     this.isReplyToId = param.getIsReplyToId();
	     this.commentContent = param.getCommentContent();
	     this.userId = param.getUserId();
	     this.markRead = param.getMarkRead();
	     this.enabled = param.getEnabled();
	     this.commentDate = param.getCommentDate();
	}
	
}
