package io.jazzylicious.artistdataapi.model.db;


import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "T_GENRE", schema = "JAMS")
public class Genre extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID recordId;

    private String genreName;

}
