package com.sait.ciaoToursEMS.services;

import com.sait.ciaoToursEMS.model.FileDB;
import com.sait.ciaoToursEMS.repositorys.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * FileStorageService
 * Allows uploading of files to the database in the form of a FileDB object
 * @author Duncan Bain
 * @version 1.0
 */

@Service
public class FileStorageService {
    @Autowired
    private FileDBRepository fileDBRepository;


    public FileDB store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
        return fileDBRepository.save(FileDB);
    }

    public FileDB getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }

}
