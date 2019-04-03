package isp.lab1;

import java.time.LocalDate;

public interface Book {

    public String getTitle();//Both

    public String getISBN();//Both

    public double getCost();//Both

    public int getQuantityOnHand(); //Both

    public LocalDate getReleaseDate();//Both

    public String getAuthor();//Book

    public void order(int quantity);//Both

    public int getPages();//Book

    public String getFormattedReleaseDate();//Both
}
