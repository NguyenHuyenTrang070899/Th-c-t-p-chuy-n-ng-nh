package Luvina.Lec5.generic.hashMap;

public class Book  
{
    private String title;
    private String author;
    private Integer year;
   public Integer code;
   public Book(String title, String author, Integer year, Integer code) {
        this.title = title;
        this.year = year;
        this.author=author;
        this.code=code;
    }
   
    public Book(String title, String author, Integer year) {
        this.title = title;
        this.year = year;
        this.author=author;
    }
      
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(Integer year) {
        this.year = year;
    } 
    @Override
    public String toString()
    {
        return author +","+ title +","+ year.toString();
    }
}
