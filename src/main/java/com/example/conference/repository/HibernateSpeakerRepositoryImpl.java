package com.example.conference.repository;

import com.example.conference.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// Repository class tier

//@Component
@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random()*100 }")
    private double seedNum;

    @Autowired
    public void setCalendar(Calendar calendar){
        this.calendar = calendar;
    }

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Brian");
        speaker.setLastName("Hansen");
        speaker.setSeedNum(seedNum);

        System.out.println("calendar: "+ calendar.getTime());

        speakers.add(speaker);

        return speakers;


    }


}
