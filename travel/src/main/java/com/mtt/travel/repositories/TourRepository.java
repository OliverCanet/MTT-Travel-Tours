package com.mtt.travel.repositories;

import com.mtt.travel.models.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour,Long> {

}
