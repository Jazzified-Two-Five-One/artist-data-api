package io.jazzylicious.artistdataapi.model.db;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "T_TRACK", schema = "JAMS")
public class Track extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID trackId;

    private String songName;

    private Integer songNo;

    private Long songDuration;

    private Boolean explicit;

}
