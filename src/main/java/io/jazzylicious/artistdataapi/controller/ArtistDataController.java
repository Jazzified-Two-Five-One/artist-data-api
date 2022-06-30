package io.jazzylicious.artistdataapi.controller;


import io.jazzylicious.artistdataapi.model.api.ArtistData;
import io.jazzylicious.artistdataapi.service.ArtistDataService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artist-data")
public class ArtistDataController {

    private final ArtistDataService artistDataService;

    public ArtistDataController(ArtistDataService artistDataService) {
        this.artistDataService = artistDataService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createArtistData(@RequestBody ArtistData artistData){
        artistDataService.createArtistData();
    }


}
