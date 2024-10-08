package com.booknic.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavoritebookDto {
    private String bookname;
    private String library;
    private String isbn;
}
