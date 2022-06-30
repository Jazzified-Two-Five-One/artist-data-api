package io.jazzylicious.artistdataapi.util;

import io.jazzylicious.artistdataapi.model.api.*;
import io.jazzylicious.artistdataapi.model.enums.RecordType;

import java.util.List;
import java.util.Set;

public class TestUtils {


    public static Object getFirstElementInSet(Set set){
       return set.stream()
                .findFirst()
                .orElseThrow();
    }


    public static ArtistData getArtistData(){

        var artistDto = ArtistDto.builder()
                .artistName("artistName")
                .profileImage("linkToArtistImage")
                .twitterHandle("twitter_handle")
                .spotifyHandle("spotify_handle")
                .instagramHandle("ig_handle")
                .biography("biography")
                .build();

        var genreDto = GenreDto.builder()
                .genreName("R&B")
                .build();

        var recordSongDto = TrackDto.builder()
                .songName("Name of Song")
                .build();

        var recordDto = RecordDto.builder()
                .recordType(RecordType.EP)
                .recordName("Name Of Album")
                .trackList(List.of(recordSongDto))
                .build();

        return ArtistData
                .builder()
                .artistDto(artistDto)
                .genreDtos(Set.of(genreDto))
                .discography(Set.of(recordDto))
                .build();
    }


}
