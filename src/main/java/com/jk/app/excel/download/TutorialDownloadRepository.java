package com.jk.app.excel.download;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk.app.common.Tutorial;

public interface TutorialDownloadRepository extends JpaRepository<Tutorial, Long> {
}