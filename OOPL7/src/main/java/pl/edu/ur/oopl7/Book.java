package pl.edu.ur.oopl7;

/**
 *
 * @author mchyla
 */
class Book extends Product {

    private int pagesNum;
    private String title;
    private String isbn;

    public Book(double price, int pagesNum) {
        this.setPrice(price);

        this.pagesNum = pagesNum;
    }

    @Override
    public String toString() {
        return "Książka '" + getTitle() + "', ISBN: " + getIsbn();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getPagesNum() {
        return pagesNum;
    }
}
