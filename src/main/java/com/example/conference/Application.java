package com.example.conference;

import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService speakerService = new SpeakerServiceImpl();

        SpeakerService speakerService = applicationContext.getBean("speakerService",SpeakerService.class);

        System.out.println(speakerService.findAll().get(0).getFirstName());
        System.out.println(speakerService.findAll().get(0).getSeedNum());

    }

}
