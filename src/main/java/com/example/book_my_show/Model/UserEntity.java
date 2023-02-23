package com.example.book_my_show.Model;


import lombok.*;

import javax.crypto.Mac;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name;
    private  int age;

    @Column(unique = true,nullable = false)
    private  String email;
    @Column(unique = true)
    private String mobNo;
    private String address;

    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL)
    private List<TicketEntity> bookedTickets=new ArrayList<>();




}