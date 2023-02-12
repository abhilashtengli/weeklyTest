package com.example.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.model.EventModel;
import com.example.university.service.EventService;

@RestController
@RequestMapping("university/Event")
public class EventController {
    @Autowired
    private EventService eventService;


    @GetMapping("getAll/EventByDate/{date}")
    public List<EventModel> findByDate(@PathVariable String date){
        return eventService.findByDate(date);
    }
    @GetMapping("getAll/EventById/{eventId}")
    public EventModel findById(@PathVariable int eventId){
        return eventService.findById(eventId);
    }

    @PostMapping("add/Event")
    public void addEvent(@RequestBody EventModel newEvent){
         eventService.addEvent(newEvent);
    }

    @PutMapping("update/EventById/{eventId}")
    public void updateEvent(@PathVariable int eventId, @RequestBody EventModel newEvent){
         eventService.updatEvent(eventId,newEvent);
    }

    @DeleteMapping("delete/EventById/{eventId}")
    public void deleteEvent(@PathVariable int eventId){
        eventService.deleteEvent(eventId);
    }
}
