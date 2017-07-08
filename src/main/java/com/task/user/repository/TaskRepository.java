package com.task.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.user.entity.Task;

/**
 * @author laxman
 *
 */
public interface TaskRepository extends JpaRepository<Task, Long> {

}
