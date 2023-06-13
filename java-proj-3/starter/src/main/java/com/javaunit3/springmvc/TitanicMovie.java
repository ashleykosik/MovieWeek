package com.javaunit3.springmvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie {
    public String getTitle() {
        return "Titanic";
    }

    public String getMaturityRating() {
        return "PG-13";
    }

    public String getGenre() {
        return "Romance";
    }


}
