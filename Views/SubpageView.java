package Views;
import javax.swing.*;

public class SubpageView {
    
    private models.ContentLinkModel model; 
    private models.EmbeddedContent eModel; 
    private controllers.addContentController controller; 

    public SubpageView (models.ContentLinkModel model,models.EmbeddedContent eModel, controllers.addContentController controller ) {
        
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

    //geteModel method returns the value of embedded content model 
    public models.EmbeddedContent geteModel(){
        return eModel; 
    }

    //seteModel method sets the value of embedded content model to model 
    public void seteModel(models.EmbeddedContent eModel) {
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
