package dev.prime.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
   @GetMapping
   public ResponseEntity<List<Movie>> getMovies(){

       return new ResponseEntity<List<Movie>>(movieService.getAllMovies(),HttpStatus.OK);
   }

   @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSIngleMovie(@PathVariable String imdbId){
       return new ResponseEntity<Optional<Movie>>(movieService.getSingleMovie(imdbId),HttpStatus.OK);
   }

}
