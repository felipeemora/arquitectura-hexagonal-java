package com.exagonal.tasks.infrastructure.driven_adapters.databse.repositories;

import com.exagonal.tasks.infrastructure.driven_adapters.databse.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
