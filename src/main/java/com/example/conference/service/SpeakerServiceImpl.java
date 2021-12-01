package com.example.conference.service;

import com.example.conference.model.Speaker;
import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//service class. We may change the repository tear dependency if needed

public class SpeakerServiceImpl implements SpeakerService {

    // we'll inject this from outside
    private SpeakerRepository speakerRepository;// = new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.speakerRepository = speakerRepository;
    }

    // Spring will look for a bean assignment compatible with 'SpeakerRepository' and will wire it
    // with the dependency speaker repository in this class.
    // That other bean can be defined inside a Java configuration class or annotated with @Component
    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl setter");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

}
