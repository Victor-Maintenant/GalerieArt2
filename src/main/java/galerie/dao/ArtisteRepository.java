package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Artiste;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring 
public interface ArtisteRepository extends JpaRepository<Artiste, Integer> {

    @Query(
            value = "SELECT DISTINCT * FROM PERSONNE WHERE dtype = 'Artiste'",
            nativeQuery = true)
    public List<Artiste> getArtiste();

}
