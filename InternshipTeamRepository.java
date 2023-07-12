package com.seneca.projecttracker.repository;

import com.seneca.projecttracker.entity.InternshipEntity;
import com.seneca.projecttracker.entity.InternshipTeamEntity;
import com.seneca.projecttracker.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InternshipTeamRepository extends CrudRepository<InternshipTeamEntity,Integer> {

    List<InternshipTeamEntity> findByUserId(Integer userId);
    List<InternshipTeamEntity> findByInternshipId(Integer internshipId);
}
