package com.exam.exam7.journalRepo;

import com.exam.exam7.models.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepo extends JpaRepository<Journal,Long> {
}
