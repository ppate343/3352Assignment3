package controllers;


public class addContentController {

    models.TextModel textModel;
    models.ContentLinkModel contentLinkModel;
    models.EmbeddedContentModel embeddedContentModel;

    Views.LessonsView lessonsView;
    Views.MainPageView mainPageView;
    Views.SubpageView subpageView;

    
    public addContentController(Views.LessonsView lessonsView, models.TextModel textModel, models.ContentLinkModel contentLinkModel, models.EmbeddedContentModel embeddedContentModel){
        this.lessonsView = lessonsView;
        this.textModel = textModel;
        this.contentLinkModel = contentLinkModel;
        this.embeddedContentModel = embeddedContentModel;

        
    }

    public addContentController(Views.MainPageView mainPageView, models.TextModel textModel, models.ContentLinkModel contentLinkModel, models.EmbeddedContentModel embeddedContentModel){
        this.mainPageView = mainPageView;
        this.textModel = textModel;
        this.contentLinkModel = contentLinkModel;
        this.embeddedContentModel = embeddedContentModel;

        
    }

    public addContentController(Views.SubpageView subpageView, models.TextModel textModel, models.ContentLinkModel contentLinkModel, models.EmbeddedContentModel embeddedContentModel){
        this.subpageView = subpageView;
        this.textModel = textModel;
        this.contentLinkModel = contentLinkModel;
        this.embeddedContentModel = embeddedContentModel;

        
    }

    public void updateLessons(){

    }   

    public void updateMainPage(){

    }  

    public void updateSubPage(){

    }  
}
