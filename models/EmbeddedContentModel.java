package models;

public class EmbeddedContentModel {

    private String embeddedURL; //URL link for embedded content (most likely video)
    private String embeddedFileName;    //name of an embedded content file to upload
    private String linkTitle;   //what will appear on the site as the text of the clickable link

    //The getEmbeddedURL method returns the value of the embeddedURL variable
    public String getEmbeddedURL() {
        return embeddedURL;
    }

    //The setEmbeddedURL method sets the value of the embeddedURL variable
    public void setEmbeddedURL(String embeddedURL) {
        this.embeddedURL = embeddedURL;
    }

    //The getEmbeddedFileName method returns the value of the embeddedFileName variable
    public String getEmbeddedFileName() {
        return embeddedFileName;
    }

    //The setEmbeddedFileName method sets the value of the embeddedFileName variable
    public void setEmbeddedFileName(String embeddedFileName) {
        this.embeddedFileName = embeddedFileName;
    }

    //The getLinkTitle method returns the value of the linkTitle variable
    public String getLinkTitle() {
        return linkTitle;
    }

    //The setLinkTitle method sets the value of the linkTitle variable
    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }
    
}
