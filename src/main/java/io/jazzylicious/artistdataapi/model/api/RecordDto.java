package io.jazzylicious.artistdataapi.model.api;


import io.jazzylicious.artistdataapi.model.enums.RecordType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecordDto {

    private String recordName;
    private RecordType recordType;
    List<TrackDto> trackList;

}
