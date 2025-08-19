package Testing_Assignment_5.Exercise1;


public class News implements INews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    //getter setter
    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}
    public String getTitle() {return Title;}
    public void setTitle(String Title) {this.Title = Title;}
    public String getPublishDate() {return PublishDate;}
    public void setPublishDate(String PublishDate) {this.PublishDate = PublishDate;}
    public String getAuthor() {return Author;}
    public void setAuthor(String Author) {this.Author = Author;}
    public String getContent() {return Content;}
    public void setContent(String Content) {this.Content = Content;}
    public float getAverageRate() {return AverageRate;}

    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("AverageRate: " + AverageRate);
    }

    @Override
    public float Calculate() {
        int[] rates = new int[3];
        int sum = 0;
        for(int rate : rates){
            sum += rate;
        }
        AverageRate = sum/rates.length;
        return AverageRate;
    }
}


