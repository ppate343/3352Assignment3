package Views;
import javax.swing.*;

public class SubpageView {
    
    //adding models 
    private models.ContentLinkModel model; 
    private models.TextModel tModel; 
    private models.EmbeddedContentModel eModel; 

    //we are assuming comments may only be added in the main page and not a subpage

    //adding controller
    private controllers.addContentController controller; 

    //constructor for subpageview 
    public SubpageView (models.ContentLinkModel model,models.EmbeddedContentModel eModel, models.TextModel tModel, controllers.addContentController controller ) {
        
        this.settModel(tModel); 
        
        this.setModel(model);   

        this.seteModel(eModel);
         
        this.setController(controller); 

    }

    public void addContentButton() {

        //allows user to click button to upload content 
        JButton content = new JButton("addContent"); 


    }

    public void addEmbeddedContentButton() {

        //allows user to click button to upload embeddedContent 
        JButton embeddedContent = new JButton("addEmbeddedContent"); 
    }

    public SubpageView() {

    }

    public void show() {
        // display or refresh page 

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

    //getController method returns the value of add content controller to controller
    public controllers.addContentController getController() {
        return controller; 

    }

    //setcontroller method sets the value of add content controller to controller
    public void setController (controllers.addContentController controller) {
        this.controller = controller; 
    }



}
