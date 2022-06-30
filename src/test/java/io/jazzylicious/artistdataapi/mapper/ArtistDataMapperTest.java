package io.jazzylicious.artistdataapi.mapper;

import io.jazzylicious.artistdataapi.model.api.ArtistData;
import io.jazzylicious.artistdataapi.model.api.GenreDto;
import io.jazzylicious.artistdataapi.model.api.RecordDto;
import io.jazzylicious.artistdataapi.model.db.Genre;
import io.jazzylicious.artistdataapi.model.db.Record;
import io.jazzylicious.artistdataapi.util.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ArtistDataMapper Tests")
@SpringBootTest
class ArtistDataMapperTest {

    private ArtistData artistData;

    @Autowired
    private ArtistDataMapper artistDataMapper;


    @BeforeEach
    void setUp() {
        artistData = TestUtils.getArtistData();
    }

    @Test
    @DisplayName("Should correctly map ArtistData Object to Artist DB Model Object")
    void artistDataToArtist_shouldReturnMappedArtist() {

        //when
        var mappedArtist = artistDataMapper.artistDataToArtist(artistData);

        //then


        assertNotNull(mappedArtist.getDiscography());
        assertNotNull(mappedArtist.getGenres());

        var discography = (RecordDto) TestUtils.getFirstElementInSet(artistData.getDiscography());
        var mappedDiscography = (Record) TestUtils.getFirstElementInSet(mappedArtist.getDiscography());
        var track = discography.getTrackList().get(0);
        var mappedTrack = mappedDiscography.getTrackList().get(0);
        var genres = (GenreDto) TestUtils.getFirstElementInSet(artistData.getGenreDtos());
        var mappedGenres = (Genre) TestUtils.getFirstElementInSet(mappedArtist.getGenres());

        assertAll("Should map ArtistData correctly to Artist DB Model POJO",
                () -> assertNull(mappedArtist.getArtistId()),
                () -> assertEquals(artistData.getArtistDto().getArtistName(), mappedArtist.getArtistName()),
                () -> assertEquals(artistData.getArtistDto().getBiography(), mappedArtist.getBiography()),
                () -> assertEquals(artistData.getArtistDto().getInstagramHandle(), mappedArtist.getInstagramHandle()),
                () -> assertEquals(artistData.getArtistDto().getTwitterHandle(), mappedArtist.getTwitterHandle()),
                () -> assertEquals(artistData.getArtistDto().getSpotifyHandle(), mappedArtist.getSpotifyHandle()),
                () -> assertEquals(artistData.getArtistDto().getProfileImage(), mappedArtist.getProfileImage()),
                () -> assertEquals(artistData.getArtistDto().getProfileImage(), mappedArtist.getProfileImage()),
                () -> assertEquals(artistData.getArtistDto().getProfileImage(), mappedArtist.getProfileImage()),
                () -> assertEquals(discography.getRecordName(), mappedDiscography.getRecordName()),
                () -> assertEquals(discography.getRecordType(), mappedDiscography.getRecordType()),
                () -> assertEquals(genres.getGenreName(), mappedGenres.getGenreName()),
                () -> assertEquals(track.getSongName(), mappedTrack.getSongName()),
                () -> assertEquals(track.getExplicit(), mappedTrack.getExplicit()),
                () -> assertEquals(track.getSongDuration(), mappedTrack.getSongDuration())
        );

    }





}