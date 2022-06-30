package io.jazzylicious.artistdataapi.model.api;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GenreDto {

    //TODO: Add Validation

    private String genreName;

    //Possibly will add more fields

}
