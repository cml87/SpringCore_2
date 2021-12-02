package com.example.conference.service;

import com.example.conference.model.Speaker;
import com.example.conference.repository.SpeakerRepository;

import java.util.List;

//service class. We may change the repository tear dependency if needed

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository; //= new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

}
