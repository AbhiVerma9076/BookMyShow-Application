package com.example.BookMyShow.dto.ResponseDto;


import com.example.BookMyShow.enums.TheatreType;
import lombok.Builder;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Builder
public class TheaterResponseDto {

    @NotNull
    int id;

    String name;
    String address;
    String city;
    TheatreType type;
    //Show Entity
}
