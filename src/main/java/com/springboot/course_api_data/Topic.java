package com.springboot.course_api_data;


@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String id,String name,String description) {
        super();
        this.id = id;
        this.name=name;
        this.description=description;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
