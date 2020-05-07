package com.exam.exam7.service.serviceImpl;

import com.exam.exam7.factory.Factory;
import com.exam.exam7.factory.StructureService;
import com.exam.exam7.journalRepo.JournalRepo;
import com.exam.exam7.models.Journal;
import com.exam.exam7.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalServiceImpl implements JournalService {
    @Autowired
    private JournalRepo journalRepo;

    @Override
    public List<Journal> getAll() {
        return null;
    }

    @Override
    public StructureService getInfo(String n){
         Journal journal = Journal.builder().name(n).build();
         save(journal);
         return Factory.getStructure(n);
    }

    @Override
    public Journal create(Journal journal, String n) {
        Factory.getStructure(n);
        return save(journal);
    }

    @Override
    public Journal save(Journal item) {
        return journalRepo.save(item);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Journal getById(Long id) {
        return null;
    }
}
