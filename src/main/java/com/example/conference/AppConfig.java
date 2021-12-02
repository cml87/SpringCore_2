package com.example.conference;

import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;
import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.example.conference"})
public class AppConfig {

    // this return a service configured with a given repository
    // Here we do setter injection. The class where we want to inject the dependency this way must have the
    // needed setter to inject the dependency from outside. The same holds for constructor injection
//    @Bean(name = "speakerService")
//    //@Scope(value = "singleton")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService(){
//        // setter injection
//        // SpeakerServiceImpl speakerServiceImpl = new SpeakerServiceImpl();
//        //speakerServiceImpl.setSpeakerRepository(getSpeakerRepository());
//
//        // constructor injection
//        //SpeakerServiceImpl speakerServiceImpl = new SpeakerServiceImpl(getSpeakerRepository());
//        SpeakerServiceImpl speakerServiceImpl = new SpeakerServiceImpl();
//
//        return speakerServiceImpl;
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }

}
