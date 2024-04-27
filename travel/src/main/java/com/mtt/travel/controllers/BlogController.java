package com.mtt.travel.controllers;

import com.mtt.travel.dtos.BlogDTO;
import com.mtt.travel.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api") // Base mapping for all methods in this controller
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/blogs") // Additional path segment for this method
    public List<BlogDTO> getAllBlogs() {
        return blogRepository.findAll().stream().map(BlogDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/blogs/{id}")
    public BlogDTO getBlogDTO(@PathVariable Long id)
    {
        return blogRepository.findById(id).map(blog -> new BlogDTO(blog)).orElse(null);
    }
}
