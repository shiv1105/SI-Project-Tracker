package com.seneca.projecttracker.repository;

import com.seneca.projecttracker.entity.InternshipEntity;
import com.seneca.projecttracker.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface InternshipRepository extends CrudRepository<InternshipEntity,Integer> {
}
