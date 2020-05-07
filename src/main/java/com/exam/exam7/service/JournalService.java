package com.exam.exam7.service;
import com.exam.exam7.factory.StructureService;
import com.exam.exam7.models.Journal;

public interface JournalService extends BaseService<Journal> {
    Journal create(Journal journal,String n);

    StructureService getInfo(String n);
}
