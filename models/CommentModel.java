package models;

public class CommentModel {


    private String CommentBody;
    private String Author;
    private String Grade;

    //Return the text of the comment
    public String getCommentBody() {
        return CommentBody;
    }

    //Set the value of the comments body
    public void setCommentBody(String CommentBody) {
        this.CommentBody = CommentBody;
    }

    //Return the author of the comment
    public String getAuthor() {
        return Author;
    }

    //Change the value of the Author
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    //Return the value of the grade
    public String getGrade() {
        return Grade;
    }
    //Changes the value of the comments grade
    public void setGrade(String grade) {
        this.Grade = grade;
    }
    
}
