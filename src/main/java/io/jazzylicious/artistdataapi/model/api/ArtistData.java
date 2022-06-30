package io.jazzylicious.artistdataapi.model.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtistData {

     private ArtistDto artistDto;
     private Set<RecordDto> discography;
     private Set<GenreDto> genreDtos;

}
