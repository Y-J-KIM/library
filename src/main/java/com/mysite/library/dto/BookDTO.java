package com.mysite.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String description;
    private String image;
    private Boolean rentAvailable;
    private Boolean rsvAvailable;
}
