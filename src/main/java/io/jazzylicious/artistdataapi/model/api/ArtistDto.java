package io.jazzylicious.artistdataapi.model.api;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDto {

    //TODO: Add validation
    private String artistName;
    private String instagramHandle;
    private String twitterHandle;
    private String spotifyHandle;
    private String profileImage;
    private String biography;

}
