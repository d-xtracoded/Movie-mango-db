package dev.prime.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRespository movieRespository;
    public List<Movie> getAllMovies(){

        return movieRespository.findAll();
    }

    public Optional<Movie> getSingleMovie(String imdbId) {

        return movieRespository.findMovieByimdbId(imdbId);
    }
}
