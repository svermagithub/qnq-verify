package com.qnq.cis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springfox.documentation.spring.web.json.Json;

public interface PayRollDataRepository extends JpaRepository<Json, Integer> {
}
