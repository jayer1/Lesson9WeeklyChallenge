package isp.lab1;

import java.time.Duration;// Album
import java.time.LocalDate; //Both

public interface Album {

    public String getTitle();//Both

    public double getCost();//Both

    public int getQuantityOnHand(); //Both

    public LocalDate getReleaseDate();//Both

    public String getArtist();//Album

    public void order(int quantity);//Both

    public Duration getPlayingTime();//Album

    public String getFormattedReleaseDate();//Both
}
