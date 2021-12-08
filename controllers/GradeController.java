package controllers;

import Views.MainPageView;
import models.CommentModel;


public class GradeController {
    private CommentModel model;
    private MainPageView view;

    //the grade controller constructor
    public GradeController(CommentModel model, MainPageView view)
    {
        this.model = model;
        this.view = view;
    }

    //change the body in the model
    public void setCommentBody(String comment)
    {
        model.setCommentBody(comment);
    }

    //get the body from the model
    public String getCommentBody()
    {
        return model.getCommentBody();
    }

    //Change the author in the model
    public void setAuthor(String author)
    {
        model.setAuthor(author);
    }

    //get the author from the model
    public String getAuthor()
    {
        return model.getAuthor();
    }

    //Update the grade of the comment model
    public void setGrade(String grade)
    {
        model.setGrade(grade);
    }

    //get the grade from the model
    public String getGrade()
    {
        return model.getGrade();
    }

    //send the information to the view
    public void updateView()
    {
        view.printComment(model.getCommentBody(), model.getAuthor(), model.getGrade());
    }

}
