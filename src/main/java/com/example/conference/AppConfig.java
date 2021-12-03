package com.example.conference;

import com.example.conference.repository.HibernateSpeakerRepositoryImpl;
import com.example.conference.repository.SpeakerRepository;
import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImpl;
import com.example.conference.util.CalendarFactory;
import java.util.Calendar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.example.conference"})
public class AppConfig {

    // Here we hard code the factory as we want it though
    @Bean("calendarFactory")
    public CalendarFactory calendarFactory(){
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);
        return calendarFactory;
    }

    // We'll get this been from the Spring container, but Spring will create it through
    // the bean factory 'calendarFactory' defined here
    @Bean("calendar")
    public Calendar getCalendar() throws Exception {
        return calendarFactory().getObject();
    }

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
