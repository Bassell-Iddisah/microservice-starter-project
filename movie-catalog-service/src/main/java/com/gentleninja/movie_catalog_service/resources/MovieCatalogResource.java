package com.gentleninja.movie_catalog_service.resources;

import com.gentleninja.movie_catalog_service.models.CatalogItem;
import com.gentleninja.movie_catalog_service.models.ratings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @GetMapping("/{userId}")
    public List<ratings> getCatalog(@PathVariable("userId") String userId) {

        List<ratings> ratingss = Arrays.asList(
                new ratings("9789", 5),
                new ratings("4563", 8),
                new ratings("4984561", 9),
                new ratings("4896514", 7)
        );

        ratingss.stream().map(ratings -> {
            new CatalogItem("Transformers", "This is a movie", 4);
        }).collect(Collectors.toList());
    }
}
