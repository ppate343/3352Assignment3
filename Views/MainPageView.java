package Views;


public class MainPageView {

    //adding models
    private models.CommentModel cModel;
    private models.ContentLinkModel model; 
    private models.TextModel tModel; 
    private models.EmbeddedContentModel eModel; 

    //adding controller
    controllers.GradeController gradeController; 


    //constructor for mainpageview 
    public MainPageView(models.CommentModel cModel, models.ContentLinkModel model,models.EmbeddedContentModel eModel, models.TextModel tModel, controllers.GradeController gradeController) {

        this.setcModel(cModel);

        this.settModel(tModel); 

        this.setModel(model);  

        this.seteModel(eModel);
        
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
    public models.CommentModel getcModel(){
        return cModel; 
    }

    //setModel method sets the value of comment Model to cModel
    public void setcModel(models.CommentModel cModel) {
        this.cModel = cModel; 
    }

     //gettModel method returns the value of text  model 
     public models.TextModel gettModel(){
        return tModel; 
    }

    //settModel method sets the value of text model to tmodel 
    public void settModel(models.TextModel tModel) {
        this.tModel = tModel; 
    }

    //geteModel method returns the value of embedded content model 
    public models.EmbeddedContentModel geteModel(){
        return eModel; 
    }

    //seteModel method sets the value of embedded content model to model 
    public void seteModel(models.EmbeddedContentModel eModel) {
        this.eModel = eModel; 
    }

    //getModel method returns the value of content link model 
    public models.ContentLinkModel getModel() {
        return model; 
    }

    //setModel method sets the value of content link model to model 
    public void setModel(models.ContentLinkModel model) {
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
