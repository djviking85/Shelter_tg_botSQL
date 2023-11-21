package com.example.shelter.repository;



/**
 * This ShelterRepository interface represents a repository for accessing
 * and managing data of objects of the {@link Shelter} class.
 * It extends the JpaRepository interface,
 * which provides basic operations for working with entities in the database,
 * such as creating, reading, updating and deleting.
 */
public interface ShelterRepository extends JpaRepository<Shelter, Long> {
    Optional<Shelter> findFirstByType(ShelterType type);
}