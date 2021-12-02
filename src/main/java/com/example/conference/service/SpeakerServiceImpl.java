package com.example.conference.service;

import com.example.conference.model.Speaker;
import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;

import java.util.List;

//service class. We may change the repository tear dependency if needed

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository rspeakerRepository; //= new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {
        System.out.println("calling SpeakerServiceImpl no-arg constructor ...");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("calling SpeakerServiceImpl argument constructor ...");
        this.rspeakerRepository = speakerRepository;
    }

    public void setSpeakerRepository(HibernateSpeakerRepositoryImpl speakerRepository) {
        System.out.println("calling setter in SpeakerServiceImpl ... ");
        this.rspeakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return rspeakerRepository.findAll();
    }

}
