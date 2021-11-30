package com.example.conference;

import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;
import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // this return a service configured with a given repository
    // Here we do setter injection. The class where we want to inject the dependency this way must have the
    // needed setter to inject the dependency from outside. The same holds for constructor injection
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        // setter injection
        // SpeakerServiceImpl speakerServiceImpl = new SpeakerServiceImpl();

        // constructor injection
        SpeakerServiceImpl speakerServiceImpl = new SpeakerServiceImpl(getSpeakerRepository());
        speakerServiceImpl.setSpeakerRepository(getSpeakerRepository());
        return speakerServiceImpl;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}
