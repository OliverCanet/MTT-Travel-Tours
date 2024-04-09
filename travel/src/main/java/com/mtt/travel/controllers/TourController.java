package com.mtt.travel.controllers;

import com.mtt.travel.dtos.TourDTO;
import com.mtt.travel.models.Tour;
import com.mtt.travel.repositories.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api") // Base mapping for all methods in this controller
public class TourController {

    @Autowired
    private TourRepository tourRepository;

    @GetMapping("/tours") // Additional path segment for this method
    public List<TourDTO> getAllPackages() {
        return tourRepository.findAll().stream().map(TourDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/tours/{id}")
    public TourDTO getTourDTO(@PathVariable Long id)
    {
        return tourRepository.findById(id).map(tour -> new TourDTO(tour)).orElse(null);
    }
}

