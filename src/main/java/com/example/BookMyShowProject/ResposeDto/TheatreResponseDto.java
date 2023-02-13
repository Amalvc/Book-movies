package com.example.BookMyShowProject.ResposeDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TheatreResponseDto {


    private int id;

    private String name;

    private String city;

    private String address;

}