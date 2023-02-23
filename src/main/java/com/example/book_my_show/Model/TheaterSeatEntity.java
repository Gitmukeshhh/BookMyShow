package com.example.book_my_show.Model;

import com.example.book_my_show.Genres.SeatType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "theater_seats")
@Data
@NoArgsConstructor
public class TheaterSeatEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private String seatNo;


    @ManyToOne
    @JoinColumn()
    private TheaterEntity theaterEntity;  // mapping WRT to theater(TheaterSeatEntity child here)




}
