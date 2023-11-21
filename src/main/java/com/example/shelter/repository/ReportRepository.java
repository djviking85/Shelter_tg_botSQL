package com.example.shelter.repository;

import com.example.shelter.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for report
 *
 * @autor Egor
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

}
