package io.jazzylicious.artistdataapi.service;

import io.jazzylicious.artistdataapi.mapper.ArtistDataMapper;
import io.jazzylicious.artistdataapi.model.api.ArtistData;
import io.jazzylicious.artistdataapi.model.db.Artist;
import io.jazzylicious.artistdataapi.repo.ArtistDataRepo;
import io.jazzylicious.artistdataapi.util.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.BDDMockito.*;


@DisplayName("ArtistDataService Tests")
@SpringBootTest
class ArtistDataServiceImplTest {

    @Autowired
    private ArtistDataService artistDataService;

    @MockBean
    private ArtistDataRepo artistDataRepo;

    @MockBean
    private ArtistDataMapper artistDataMapper;


    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Should successfully call repo save method to insert new record in DB")
    void createArtistData_shouldCallRepoSave() {

        //given
        var artistData = TestUtils.getArtistData();
        given(artistDataRepo.save(any(Artist.class))).willReturn(new Artist());
        given(artistDataMapper.artistDataToArtist(any(ArtistData.class))).willReturn(new Artist());


        //when
        artistDataService.createArtistData(artistData);

        //then
        verify(artistDataRepo, times(1)).save(any(Artist.class));
        verify(artistDataMapper, times(1)).artistDataToArtist(any(ArtistData.class));

    }
}