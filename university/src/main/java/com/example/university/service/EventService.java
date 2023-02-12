package com.example.university.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.university.model.EventModel;

@Service
public class EventService {
   private static List<EventModel> events = new ArrayList<>();

static {
     events.add(new EventModel(01,"FreshersDay","mumbai","22-2-23","10.30 Am", "1.00 pm"));
     events.add(new EventModel(02,"EthnicDay","mumbai","23-2-23","10.30 Am", "1.00 pm"));
     events.add(new EventModel(03,"SportsDay","mumbai","24-2-23","10.30 Am", "1.00 pm"));
     events.add(new EventModel(04,"DanceCompetation","mumbai","25-2-23","10.30 Am", "1.00 pm"));
     events.add(new EventModel(05,"Annual Day","mumbai","26-2-23","10.30 Am", "1.00 pm"));
}

    public List<EventModel> findByDate(String date) {
        List<EventModel> result = new ArrayList<>();
        for(EventModel u : events){
            if(u.getDate().equals(date)){
                result.add(u);
            }
        }
        return result;
    }

    public EventModel findById(int eventId) {
        return events.stream().filter(t-> t.getEventId()==eventId).findFirst().get();
    }
    
    public void addEvent(EventModel newEvent) {
        events.add(newEvent);
    }

    public void updatEvent(int eventId, EventModel newEvent) {

        EventModel event = findById(eventId);
        event.setEventId(newEvent.getEventId());
        event.setDate(newEvent.getDate());
        event.setEndTime(newEvent.getEndTime());
        event.setEventName(newEvent.getEventName());
        event.setLocationOfEvent(newEvent.getLocationOfEvent());
        event.setStartTime(newEvent.getStartTime());

    }

    public void deleteEvent(int eventId) {
        EventModel e = findById(eventId);
        events.remove(e);
    }


    


   

 
}
