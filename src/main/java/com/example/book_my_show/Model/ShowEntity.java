package com.example.book_my_show.Model;

import com.example.book_my_show.Genres.ShowType;
import jdk.jfr.Timespan;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shows")
@Data
public class ShowEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

   private LocalDate showDate;
   private LocalTime showTime;

    @Enumerated(value =EnumType.STRING)
    private ShowType showType;


    @CreationTimestamp
    private  Data createdOn;

    @UpdateTimestamp
    private Date updatedOn;



    // This is child wrt to movieEntity

    @ManyToOne
    @JoinColumn
    private  MovieEntity movieEntity;


    // This is  child wrt Theater
    @ManyToOne
    @JoinColumn
    private  TheaterEntity theaterEntity;


    // show is parent wt to tickets

    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<TheaterEntity> listOfBookedTickets=new ArrayList<>();


    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private  List<ShowSeatEntity>listOfShowSeat=new ArrayList<>();


}
