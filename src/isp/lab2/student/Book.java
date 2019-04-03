package isp.lab2.student;

import java.time.LocalDate;

public interface Book extends Product {

    public String getISBN();

    public String getAuthor();

    public int getPages();

}
