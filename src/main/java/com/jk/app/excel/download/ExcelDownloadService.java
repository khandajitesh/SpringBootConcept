package com.jk.app.excel.download;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.app.common.Tutorial;


@Service
public class ExcelDownloadService {
  @Autowired
  TutorialDownloadRepository repository;

  public ByteArrayInputStream load() {
    List<Tutorial> tutorials = repository.findAll();

    ByteArrayInputStream in = ExcelDownloadHelper.tutorialsToExcel(tutorials);
    return in;
  }

}