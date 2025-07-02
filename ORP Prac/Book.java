public class Book{
	private String title;
	private String author;
	private int chapter_count;
	public Book(){
		
	}
	public Book(String title,String author,int chapter_count){
		this.title=title;
		this.author=author;
		this.chapter_count=chapter_count;
		
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public int getChapterCount(){
		return chapter_count;
	}
	public String toString(){
		return "Title: "+title +"\n"+"Author:"+author+"\n"+"Number of Chapters:"+chapter_count;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setCount(int count){
		this.chapter_count=count;
	}
	public int getPageCount(int pages_per_chapter){
		return pages_per_chapter*chapter_count;
	}
}