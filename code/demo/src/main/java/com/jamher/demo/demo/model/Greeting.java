package com.jamher.demo.demo.model;

public class Greeting {

    public Greeting(Long id, String content){
        this.id = id;
        this.content = content;
    }

    private Long id;
	private String content;

    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
