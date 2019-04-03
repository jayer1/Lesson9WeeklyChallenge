package isp.lab2.student;

import java.time.LocalDate;

public interface Product {

    public double getCost();

    public String getTitle();

    public int getQuantityOnHand();

    public void order(int quantity);

    public LocalDate getReleaseDate();

    public String getFormattedReleaseDate();
}
