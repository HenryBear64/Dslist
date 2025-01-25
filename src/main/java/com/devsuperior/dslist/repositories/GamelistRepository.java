package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Gamelist;

public interface GamelistRepository extends JpaRepository<Gamelist, Long> {

}
