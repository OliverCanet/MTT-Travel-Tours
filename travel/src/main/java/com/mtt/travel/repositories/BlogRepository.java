package com.mtt.travel.repositories;

import com.mtt.travel.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository  extends JpaRepository<Blog,Long> {
}
