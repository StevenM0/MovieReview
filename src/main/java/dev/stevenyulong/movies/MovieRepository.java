package dev.stevenyulong.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// The repository layer is also the data access layer
// It actually talks to the database and gets the data
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // Automatic Query Methods
    Optional<Movie> findMovieByImdbId(String imdbId);
}
