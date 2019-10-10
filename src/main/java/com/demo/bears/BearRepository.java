package com.demo.bears;

import com.demo.bears.Bear;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BearRepository extends CrudRepository<Bear, Long> {

}