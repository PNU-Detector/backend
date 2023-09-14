package com.detector.pnutour.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface StructureRepository extends MongoRepository<com.detector.pnutour.entity.Structure,String> {
    Optional<com.detector.pnutour.entity.Structure> findByCode(String code);
    List<com.detector.pnutour.entity.Structure> findAllByCodeStartingWithOrderByName(String structureType);
    List<com.detector.pnutour.entity.Structure> findAllByCodeStartingWithOrderByCode(String structureType);
    com.detector.pnutour.entity.Structure save(com.detector.pnutour.entity.Structure structure);
    Optional<com.detector.pnutour.entity.Structure> deleteByCode(String code);
}
