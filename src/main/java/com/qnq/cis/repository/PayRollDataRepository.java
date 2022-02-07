package com.qnq.cis.repository;

import io.swagger.v3.core.util.Json;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PayRollDataRepository extends JpaRepository<Json, Integer> {
}
