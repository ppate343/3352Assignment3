package Views;

import controllers.addContentController;
import java.util.ArrayList;

public class LessonsView {

    private ArrayList<models.ContentLinkModel> pages = new ArrayList(); //array list to hold the pages
    private models.ContentLinkModel model;  //available if teacher wants to add a content link
    private models.EmbeddedContentModel eModel; //available if teacher wants to add an embed to a lesson
    private models.TextModel tModel; //visible text on the lesson page

    //we are assuming comments can only be added on a main page, and not in the lessons tab

    private controllers.addContentController controller; 

    public LessonsView(models.ContentLinkModel model, models.EmbeddedContentModel eModel, controllers.addContentController controller, models.TextModel tModel) {

        this.setModel(model);   

        this.seteModel(eModel); 
         
        this.setController(controller); 

        this.settModel(tModel);

        this.displayPage();

    }

    //getter and setter for ContentLinkModel
    public models.ContentLinkModel getModel() {
        return model;
    }
    public void setModel(models.ContentLinkModel model) {
        this.model = model;
    }
  
    //getter and setter for EmbeddedContentModel
    public models.EmbeddedContentModel geteModel() {
        return eModel;
    }
    public void seteModel(models.EmbeddedContentModel eModel) {
        this.eModel = eModel;
    }

    //getter and setter for addContentController
    public controllers.addContentController getController() {
        return controller;
    }
    public void setController(controllers.addContentController controller) {
        this.controller = controller;
    }

    //getter and setter for TextModel
    public models.TextModel gettModel() {
        return tModel;
    }
    public void settModel(models.TextModel tModel) {
        this.tModel = tModel;
    }

    public void displayPage() {
        //function to display lesson content on page
    }

    //add a page to the array
    public void addPage(models.ContentLinkModel page) {
        this.pages.add(page);
    }

    //delete a page from the array
    public void deletePage(models.ContentLinkModel page) {
        this.pages.remove(page);
    }
    
}
