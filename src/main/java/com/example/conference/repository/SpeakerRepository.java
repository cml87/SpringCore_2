package com.example.conference.repository;

import com.example.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
