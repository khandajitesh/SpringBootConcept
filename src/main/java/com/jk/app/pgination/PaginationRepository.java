package com.jk.app.pgination;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jk.app.common.Tutorial;

public interface PaginationRepository extends JpaRepository<Tutorial, Long>{
	Page<Tutorial> findByPublished(boolean published, Pageable pageable);
	Page<Tutorial> findByTitleContaining(String title, Pageable pageable);
}
