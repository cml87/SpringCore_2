package com.example.conference.service;

import com.example.conference.model.Speaker;
import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;

import java.util.List;

//service class. We may change the repository tear dependency if needed

public class SpeakerServiceImpl implements SpeakerService {

    // we'll inject this from outside
    private SpeakerRepository speakerRepository;// = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }


    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

}
