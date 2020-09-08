package com.jk.app.exceptionhandling;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk.app.common.Tutorial;

public interface ExceptionHandlerTutorialRepository extends JpaRepository<Tutorial, Long> {
	  List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);
}
