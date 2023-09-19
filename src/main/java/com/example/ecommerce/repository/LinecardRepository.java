package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Linecard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinecardRepository extends JpaRepository<Linecard, Integer> {
}
