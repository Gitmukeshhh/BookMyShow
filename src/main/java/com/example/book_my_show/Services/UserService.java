package com.example.book_my_show.Services;

import com.example.book_my_show.EntryDtos.UserEntryDto;
import com.example.book_my_show.Model.UserEntity;
import com.example.book_my_show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public  void addUser(UserEntryDto userEntryDto){

        // Here we need to convert and save
        /*

        Old Methode : create an object and set Attributes.

         */

        UserEntity userEntity=UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName())
                .address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo())
                .build();


          userRepository.save(userEntity);


    }


}
