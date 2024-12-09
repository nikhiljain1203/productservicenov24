package com.example.productservicenov24.controllers;

import com.example.productservicenov24.models.Product;
import com.example.productservicenov24.services.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    // Constructor injection for SearchService
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    /**
     * Endpoint to search for products by keyword.
     * Example: /search?keyword="example"
     *
     * @param keyword the search keyword
     * @return a list of matching products
     */
    @GetMapping
    public List<Product> search(
            @RequestParam("keyword") String keyword,
            @RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return searchService.search(keyword, pageNumber, pageSize);
    }
}
