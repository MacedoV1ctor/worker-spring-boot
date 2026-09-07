package com.victor.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>  {

}
