package com.example.book_my_show.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theater")
@Data
@NoArgsConstructor
public class TheaterEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String name;
    private String location;


    // This is the parent wrt to TheaterSeatEntity

    @OneToMany(mappedBy = "theaterEntity",cascade = CascadeType.ALL)
    private List<TheaterSeatEntity> theaterSeatEntities=new ArrayList<>();

    @OneToMany(mappedBy = "theaterEntity",cascade =CascadeType.ALL)
    private  List<ShowEntity>showEntityList=new ArrayList<>();

}
