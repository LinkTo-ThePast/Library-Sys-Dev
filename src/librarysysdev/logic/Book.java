package librarysysdev.logic;

public class Book {
  
  private int unit_id;
  private String title;
  private String author;
  private int rlse_year; 
  private String genre;
  private String editorial;
  private String isbn;
  private int stockInSystem;

  public Book() {
  }

  public Book(int unit_id, String title, String author, int rlse_year, String genre, String editorial, String isbn, int stockInSystem) {
    this.unit_id = unit_id;
    this.title = title;
    this.author = author;
    this.rlse_year = rlse_year;
    this.genre = genre;
    this.editorial = editorial;
    this.isbn = isbn;
    this.stockInSystem = stockInSystem;
  }

  public int getUnit_id() {
    return unit_id;
  }

  public void setUnit_id(int unit_id) {
    this.unit_id = unit_id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getRlse_year() {
    return rlse_year;
  }

  public void setRlse_year(int rlse_year) {
    this.rlse_year = rlse_year;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getStockInSystem() {
    return stockInSystem;
  }

  public void setStockInSystem(int stockInSystem) {
    this.stockInSystem = stockInSystem;
  }
 
  
}