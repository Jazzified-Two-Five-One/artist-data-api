package io.jazzylicious.artistdataapi.model.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrackDto {

    private String songName;
    private Integer songNo;
    private Long songDuration;
    private Boolean explicit;


}
