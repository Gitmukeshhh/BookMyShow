package com.example.book_my_show.Model;

import com.example.book_my_show.Genres.Genre;
import com.example.book_my_show.Genres.Language;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Data

public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;


    @Column(unique = true,nullable = false)
    private  String movieName;

    private  double rating;

    private  int duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    // this is parent wrt movies
    @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList=new ArrayList<>();

}
