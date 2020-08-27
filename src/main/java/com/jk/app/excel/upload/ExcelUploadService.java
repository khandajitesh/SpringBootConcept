package com.jk.app.excel.upload;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jk.app.common.Tutorial;

@Service
public class ExcelUploadService {
  @Autowired
  TutorialUploadRepository repository;

  public void save(MultipartFile file) {
    try {
      List<Tutorial> tutorials = ExcelUploadHelper.excelToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store excel data: " + e.getMessage());
    }
  }

  public List<Tutorial> getAllTutorials() {
    return repository.findAll();
  }
}