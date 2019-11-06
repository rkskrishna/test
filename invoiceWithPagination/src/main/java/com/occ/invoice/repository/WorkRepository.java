package com.occ.invoice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.occ.invoice.model.WorkEntity;

public interface WorkRepository extends CrudRepository<WorkEntity, Long> 
{
	Page<WorkEntity> findAll(Pageable pageable);

}
