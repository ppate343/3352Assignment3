package Views;


public class MainPageView {

    private models.CommentModel model;

    controllers.GradeController gradeController; 

    public MainPageView(models.CommentModel model,  controllers.GradeController gradeController) {

        this.setModel(model);
        this.setController(gradeController); 
    }


    public void addComment() {

        //collects comment data from the user 

            String comments = "3352 data comment"; 

    }

    public MainPageView() {

    }

    public void show() {
        // display or refresh page 

    }

    //getModel method returns the value of comment model
    public models.CommentModel getModel(){
        return model; 
    }

    //setModel method sets the value of comment Model to model
    public void setModel(models.CommentModel model) {
        this.model = model; 
    }
    //getController method returns the value of grade controller 
    public controllers.GradeController getController() {
        return gradeController; 
    }

    //setController method sets the value of grade controller to gradeController
     public void setController(controllers.GradeController gradeController) {
        this.gradeController = gradeController; 

    }

    //printComment method allows user to add comment
    public void printComment(String commentBody, String author, String grade) {
    }



}
