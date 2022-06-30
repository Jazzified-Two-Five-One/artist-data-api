package io.jazzylicious.artistdataapi.model.db;

import io.jazzylicious.artistdataapi.model.enums.RecordType;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "T_RECORD", schema = "JAMS")
public class Record extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID recordId;

    private String recordName;

    @Enumerated(EnumType.STRING)
    private RecordType recordType;

    @OneToMany
    private List<Track> trackList;

}
