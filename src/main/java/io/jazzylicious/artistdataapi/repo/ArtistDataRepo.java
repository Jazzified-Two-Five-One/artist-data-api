package io.jazzylicious.artistdataapi.repo;

import io.jazzylicious.artistdataapi.model.db.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArtistDataRepo extends JpaRepository<Artist, UUID> {



}
