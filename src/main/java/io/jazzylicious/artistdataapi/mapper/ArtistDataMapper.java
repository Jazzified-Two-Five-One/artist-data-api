package io.jazzylicious.artistdataapi.mapper;


import io.jazzylicious.artistdataapi.model.api.ArtistData;
import io.jazzylicious.artistdataapi.model.db.Artist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArtistDataMapper {
    @Mapping(source = "artistDto.artistName", target = "artistName")
    @Mapping(source = "artistDto.instagramHandle", target = "instagramHandle")
    @Mapping(source = "artistDto.twitterHandle", target = "twitterHandle")
    @Mapping(source = "artistDto.spotifyHandle", target = "spotifyHandle")
    @Mapping(source = "artistDto.profileImage", target = "profileImage")
    @Mapping(source = "artistDto.biography", target = "biography")
    @Mapping(source = "genreDtos", target = "genres")
    Artist artistDataToArtist(ArtistData artistData);
}
