package com.example.conference;

import com.example.conference.service.SpeakerService;
import com.example.conference.service.SpeakerServiceImpl;

public class Application {

    public static void main(String args[]){

        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());

    }

}
