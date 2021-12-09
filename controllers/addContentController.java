package controllers;


public class addContentController {

    private models.TextModel textModel;
    private models.ContentLinkModel contentLinkModel;
    private models.EmbeddedContentModel embeddedContentModel;

    private Views.LessonsView lessonsView;
    private Views.MainPageView mainPageView;
    private Views.SubpageView subpageView;

    //------------ CONSTRUCTOR FOR EACH VIEW -----------------------------------
    
    public addContentController(Views.LessonsView lessonsView, models.TextModel textModel, models.ContentLinkModel contentLinkModel, models.EmbeddedContentModel embeddedContentModel){
        this.lessonsView = lessonsView;
        this.textModel = textModel;
        this.contentLinkModel = contentLinkModel;
        this.embeddedContentModel = embeddedContentModel;

        //function to display content on lessons page
        lessonsView.displayPage();
    }

    public addContentController(Views.MainPageView mainPageView, models.TextModel textModel, models.ContentLinkModel contentLinkModel, models.EmbeddedContentModel embeddedContentModel){
        this.mainPageView = mainPageView;
        this.textModel = textModel;
        this.contentLinkModel = contentLinkModel;
        this.embeddedContentModel = embeddedContentModel;

        //function to display content on mainpage
        mainPageView.show();
    }

    public addContentController(Views.SubpageView subpageView, models.TextModel textModel, models.ContentLinkModel contentLinkModel, models.EmbeddedContentModel embeddedContentModel){
        this.subpageView = subpageView;
        this.textModel = textModel;
        this.contentLinkModel = contentLinkModel;
        this.embeddedContentModel = embeddedContentModel; 
        
        //function to display content on subpage
        subpageView.show();
    }

    //--------- TEXT MODEL CONTROLS ---------------------------------------

    //The getContent gets value of the text box model
    public String getContent() {
        return textModel.getContent();
    }
    //The setContent gets the value of the text box model
    public void setContent(String content) {
        setContent(content);
    }

    //--------- CONTENT LINK CONTROLS -------------------------------------

    //The getURL method gets the value of the URL variable
    public String getURL() {
        return contentLinkModel.getURL();
    }

    //The setURL method sets the value of the URL variable
    public void setURL(String URL) {
        contentLinkModel.setURL(URL);
    }

    //The getFileName method returns the value of the fileName variable
    public String getFileName() {
        return contentLinkModel.getFileName();
    }

    //The setFileName method sets the value of the fileName variable
    public void setFileName(String fileName) {
        contentLinkModel.setFileName(fileName);
    }

    //The getLinkTitle method returns the value of the linkTitle variable
    public String getLinkTitle() {
        return contentLinkModel.getLinkTitle();
    }

    //The setLinkTitle method sets the value of the linkTitle variable
    public void setLinkTitle(String linkTitle) {
        contentLinkModel.setLinkTitle(linkTitle);
    }

    //--------- EMBEDDED CONTENT CONTROLS -------------------------------------

     //The getEmbeddedURL method returns the value of the embeddedURL variable
     public String getEmbeddedURL() {
        return embeddedContentModel.getEmbeddedURL();
    }

    //The setEmbeddedURL method sets the value of the embeddedURL variable
    public void setEmbeddedURL(String embeddedURL) {
        embeddedContentModel.setEmbeddedURL(embeddedURL);
    }

    //The getEmbeddedFileName method returns the value of the embeddedFileName variable
    public String getEmbeddedFileName() {
        return embeddedContentModel.getEmbeddedFileName();
    }

    //The setEmbeddedFileName method sets the value of the embeddedFileName variable
    public void setEmbeddedFileName(String embeddedFileName) {
        embeddedContentModel.setEmbeddedFileName(embeddedFileName);
    }

    //The getLinkTitle method returns the value of the linkTitle variable
    public String getEmbeddedLinkTitle() {
        return embeddedContentModel.getLinkTitle();
    }

    //The setLinkTitle method sets the value of the linkTitle variable
    public void setEmbeddedLinkTitle(String linkTitle) {
        embeddedContentModel.setLinkTitle(linkTitle);
    }

    //------- DISPLAY CONTENT ON DIFFERENT VIEWS -----------------
    
    public void updateLessonsView()
    {
        lessonsView.displayPage();
    }

    public void updateMainPageView()
    {
        mainPageView.show();
    }

    public void updateSubpageView()
    {
        subpageView.show();
    }
}
