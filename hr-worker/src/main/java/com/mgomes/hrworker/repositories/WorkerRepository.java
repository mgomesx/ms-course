package com.mgomes.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgomes.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
