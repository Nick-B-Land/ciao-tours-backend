package com.sait.ciaoToursEMS.upload.repository;

import com.sait.ciaoToursEMS.upload.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
