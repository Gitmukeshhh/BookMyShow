package com.example.book_my_show.EntryDtos;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserEntryDto {

    private  String name;


    private  int age;


    private  String email;

    private String mobNo;

    private String address;



}
