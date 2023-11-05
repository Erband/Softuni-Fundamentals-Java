package Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    // constructor
   public Article (String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
   }

   public void Edit(String content) {
       this.content = content;
   }

   public void ChangeAuthor(String author){
       this.author = author;
   }

   public void Rename(String title){
       this.title = title;
   }

   public  String toString(){
       return (title + " - " + content + ": " + author );
   }
}

