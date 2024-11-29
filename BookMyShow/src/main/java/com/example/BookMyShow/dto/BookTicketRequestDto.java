package com.example.BookMyShow.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BookTicketRequestDto {

    int id;

    String name;

    String mobNo;

    //Optional
    List<TicketDto> tickets;

}
