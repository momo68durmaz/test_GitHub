package TheSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Submissions {
	
	private String userName;
	private LocalDate timeStamp;
	private int like;
	private ArrayList<Comment> comments;
	
	
	public Submissions(String userName) {
		super();
		this.userName = userName;
		this.timeStamp = LocalDate.now();
		this.like = 0;
		this.comments = new ArrayList<>();
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public LocalDate getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}


	public int getLike() {
		return like;
	}


	public void setLike(int like) {
		this.like = like;
	}


	public ArrayList<Comment> getComments() {
		return comments;
	}


	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
	
	
	 public void addComment(String comments) {
	        this.comments.add(comments);
	    }
	 
	 public void removeComment(String comments) {
	        this.comments.remove(comments);
	    }

	 public void printAllComments() {
		 for(Comment c : this.comments) {
			 System.out.println(c);
		 }
	 }
	
}
