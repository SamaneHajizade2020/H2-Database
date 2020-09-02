package com.in28minutes.springboot.jpa.hibernate.h2.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultOptimiseRepository extends JpaRepository<ResultOptimise, Long> {

}
