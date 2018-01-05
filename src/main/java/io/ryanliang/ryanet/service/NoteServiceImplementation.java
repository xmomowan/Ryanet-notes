package io.ryanliang.ryanet.service;

import io.ryanliang.ryanet.dao.NoteDao;
import io.ryanliang.ryanet.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NoteServiceImplementation implements NoteService {

    private NoteDao dao;

    @Autowired
    public void setDao(NoteDao dao) {

        this.dao = dao;
    }

    @Override
    public Note save(Note entity) {

        dao.persist(entity);
        return entity;
    }

    @Override
    public List<Note> findAll() {

        return dao.findAll();
    }

    @Override
    public Note delete(Note entity) {

        dao.delete(entity);
        return entity;
    }
}
