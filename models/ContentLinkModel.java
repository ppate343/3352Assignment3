package models;

public class ContentLinkModel {

    private String URL; //URL link
    private String fileName;    //name of a file to upload
    private String linkTitle;   //what will appear on the site as the text of the clickable link

    //The getURL method returns the value of the URL variable
    public String getURL() {
        return URL;
    }

    //The setURL method sets the value of the URL variable
    public void setURL(String URL) {
        this.URL = URL;
    }

    //The getFileName method returns the value of the fileName variable
    public String getFileName() {
        return fileName;
    }

    //The setFileName method sets the value of the fileName variable
    public void setFileName(String fileName) {
        this.fileName = fileName;
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
