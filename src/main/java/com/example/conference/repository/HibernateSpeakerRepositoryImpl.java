package com.example.conference.repository;

import com.example.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

// Repository class tier

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Brian");
        speaker.setLastName("Hansen");

        speakers.add(speaker);

        return speakers;


    }


}
