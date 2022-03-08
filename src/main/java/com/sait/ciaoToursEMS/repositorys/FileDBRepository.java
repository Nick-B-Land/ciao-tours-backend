package com.sait.ciaoToursEMS.repositorys;


import com.sait.ciaoToursEMS.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
