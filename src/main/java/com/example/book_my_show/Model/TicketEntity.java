package com.example.book_my_show.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tickets")
@Data
@NoArgsConstructor
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String movieName;
    private LocalDate showDate;
    private LocalDate showTime;
    private  int totalAmount;
    private String ticketId= UUID.randomUUID().toString();
    private String theaterName;

    @ManyToOne
    @JoinColumn
    private  UserEntity userEntity;

    // this is child wrt showEntity

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;
}
