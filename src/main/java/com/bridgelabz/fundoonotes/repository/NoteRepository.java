package com.bridgelabz.fundoonotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.fundoonotes.model.NoteModel;

public interface NoteRepository extends JpaRepository<NoteModel, Long>{

	
}
