package com.springboot.course_api_data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /*private List<Topic> topics=new ArrayList<>(Arrays.asList(
                    new Topic("spring","spring framework","spring description"),
                    new Topic("java","java core","java description"),
                    new Topic("python","pyspark framework","pyspark description")
            ));*/

    public List<Topic> getAllTopic(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String id){
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }
    public void updateTopic(Topic topic,String id){
        /*for(int i=0;i< topics.size();i++){
            Topic t=topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }*/
        topicRepository.save(id);
    }

    public void deleteTopic(String id){
        //topics.removeIf(t->t.getId().equals(id));
        topicRepository.delete(id);
    }
}
