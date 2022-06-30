package io.jazzylicious.artistdataapi.model.db;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

// JAM - Jazzified Artist Management Services

@Getter
@Setter
@Entity
@Table(name = "T_ARTIST", schema = "JAMS")
public class Artist extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID artistId;

    private String artistName;

    private String instagramHandle;

    private String twitterHandle;

    private String spotifyHandle;

    private String profileImage;

    private String biography;

    @OneToMany
    private Set<Record> discography;

    @OneToMany
    private Set<Genre> genres;

}
