package com.example.BookMyShowProject.RequestDto;



import javax.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class MovieRequestDto {

    @Column(nullable = false)
    private String name;

    private int duration;

    private Date releaseDate;





}

