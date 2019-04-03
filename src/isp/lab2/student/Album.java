package isp.lab2.student;

import java.time.Duration;
import java.time.LocalDate;

public interface Album extends Product {

    public String getArtist();

    public Duration getPlayingTime();

}
