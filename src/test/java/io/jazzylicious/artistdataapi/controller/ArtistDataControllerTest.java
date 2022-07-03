package io.jazzylicious.artistdataapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jazzylicious.artistdataapi.model.api.ArtistData;
import io.jazzylicious.artistdataapi.service.ArtistDataServiceImpl;
import io.jazzylicious.artistdataapi.util.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.times;
import static org.mockito.BDDMockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@DisplayName("ArtistDataController Tests ")
@WebMvcTest(ArtistDataController.class)
class ArtistDataControllerTest {

    @Autowired
    private MockMvc client;

    @MockBean
    private ArtistDataServiceImpl artistDataServiceImpl;

    private final String baseUrl = "/artist-data";

    private ArtistData artistData;

    private ObjectMapper objectMapper;


    @BeforeEach
    void setUp() {
        artistData = TestUtils.getArtistData();
        objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter();
    }

    @Test
    @DisplayName("Should return 201 after Artist Data is persisted in DB")
    void createArtistData_returns201Created() throws Exception {
        //given
        var artistDataMarshalled = objectMapper.writeValueAsString(artistData);

        //when
        var response  = client.perform(post(baseUrl)
                .content(artistDataMarshalled)
                .contentType(MediaType.APPLICATION_JSON));
        //then
        response.andExpect(status().isCreated());
        verify(artistDataServiceImpl, times(1)).createArtistData(any(ArtistData.class));
    }


}