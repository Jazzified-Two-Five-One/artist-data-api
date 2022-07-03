package io.jazzylicious.artistdataapi.controller;


import io.jazzylicious.artistdataapi.model.api.ArtistData;
import io.jazzylicious.artistdataapi.service.ArtistDataServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artist-data")
public class ArtistDataController {

    private final ArtistDataServiceImpl artistDataServiceImpl;

    public ArtistDataController(ArtistDataServiceImpl artistDataServiceImpl) {
        this.artistDataServiceImpl = artistDataServiceImpl;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createArtistData(@RequestBody ArtistData artistData){
        artistDataServiceImpl.createArtistData(artistData);
    }


}
