package dev.stevenyulong.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
// The service layer is responsible for handling the business logic.
// The service class uses the repository interface to talk to the database.
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbid) {
        return movieRepository.findMovieByImdbId(imdbid);
    }
}
