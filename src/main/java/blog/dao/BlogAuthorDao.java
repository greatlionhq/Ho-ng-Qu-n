package blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import blog.entity.BlogAuthor;

public class BlogAuthorDao implements BlogDao<BlogAuthor>{
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void connect() {
		Context ctx;
		try {
			
			ctx = new InitialContext();
			Context env = (Context)ctx.lookup("java:comp.env");
			DataSource ds = (DataSource)env.lookup("jdbl/mysql");
			conn = ds.getConnection();
			
			
		} catch (NamingException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	@Override
	public BlogAuthor findOne(int id) {
		connect();
		
		try {
			String sql = "select * from blog_author where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			//update (name,age,adr) values (?,?,?)
			BlogAuthor author = new BlogAuthor();
			
			while(rs.next()) {
				author.setId(rs.getInt("id"));
				author.setDisplayName("display_name");
				author.setFirstName("first_name");
				author.setLastName("last_name");
			}
			
			return author;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}

	@Override
	public List<BlogAuthor> findAll() {
		connect();
		
		try {
			String sql = "select * from blog_author";
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			List<BlogAuthor> list = new ArrayList<>();
			
			while(rs.next()) {
				BlogAuthor author = new BlogAuthor();
				author.setId(rs.getInt("id"));
				author.setDisplayName("display_name");
				author.setFirstName("first_name");
				author.setLastName("last_name");
				
				list.add(author);
			}
			return list;
		} catch (Exception e) {
			
		} finally {
			close();
		}
		return null;
	}

	@Override
	public List<BlogAuthor> find(BlogAuthor arg) {
		connect();
		
		try {
			String sql = "select * from blog_author where first_name=? or last_name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, arg.getFirstName());
			pstmt.setString(2, arg.getLastName());
			
			rs = pstmt.executeQuery();
			
			List<BlogAuthor> list = new ArrayList<>();
			while(rs.next()) {
				BlogAuthor author = new BlogAuthor();
				
				author.setId(rs.getInt("id"));
				author.setDisplayName("display_name");
				author.setFirstName("first_name");
				author.setLastName("last_name");
				
				list.add(author);
			}
			return list;
			
		} catch (Exception e) {
			
		}
		return null;
	}

	@Override
	public int insert(BlogAuthor arg) {
		connect();
		
		try {
			String sql = "insert into blog_author (display_name, first_name, last_name) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, arg.getDisplayName());
			pstmt.setString(2, arg.getFirstName());
			pstmt.setString(3, arg.getLastName());
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.fillInStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	@Override
	public void update(BlogAuthor arg) {
		connect();
		
		try {
			String sql = "update blog_author set dispaly_name=? first_name=? last_name=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, arg.getDisplayName());
			pstmt.setString(2, arg.getFirstName());
			pstmt.setString(3, arg.getLastName());
			pstmt.setInt(4, arg.getId());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}

	@Override
	public void delete(int id) {
		connect();
		
		try {
			String sql = "delete blog_author where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
}
