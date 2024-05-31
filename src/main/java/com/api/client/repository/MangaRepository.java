package com.api.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.client.entity.Manga;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {
}
