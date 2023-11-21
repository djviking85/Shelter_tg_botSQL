package com.example.shelter.repository;

import org.spriegrambotshelter.entity.Users;

/**
 * This UsersRepository interface represents a repository for accessing
 * and managing data of objects of the {@link Users} class.
 * It extends the JpaRepository interface,
 * which provides basic operations for working with entities in the database,
 * such as creating, reading, updating and deleting.
 */
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByChatId(Long chatId);
}
