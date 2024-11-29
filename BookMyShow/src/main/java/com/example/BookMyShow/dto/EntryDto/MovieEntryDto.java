package com.example.BookMyShow.dto.EntryDto;

import lombok.Builder;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Getter
@Builder
public class MovieEntryDto {

    String name;

    @NotNull
    LocalDate releaseDate;
}
