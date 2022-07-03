package io.jazzylicious.artistdataapi.service;


import io.jazzylicious.artistdataapi.mapper.ArtistDataMapper;
import io.jazzylicious.artistdataapi.model.api.ArtistData;
import io.jazzylicious.artistdataapi.repo.ArtistDataRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArtistDataServiceImpl implements ArtistDataService{


    private final ArtistDataRepo artistDataRepo;

    private final ArtistDataMapper artistDataMapper;

    @Override
    public void createArtistData(ArtistData artistData) {

        var artist = artistDataMapper.artistDataToArtist(artistData);

        artistDataRepo.save(artist);

    }
}
