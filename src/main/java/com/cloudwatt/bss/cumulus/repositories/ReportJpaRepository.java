package com.cloudwatt.bss.cumulus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cloudwatt.bss.cumulus.entities.Report;

@RepositoryRestResource(collectionResourceRel = "reports", path = "reports")
public interface ReportJpaRepository extends JpaRepository<Report, Integer> {

}
