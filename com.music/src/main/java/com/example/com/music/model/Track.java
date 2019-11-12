package com.example.com.music.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "tracks")
public class Track {
	@Id
	private String id;
	private String title;
	private int duration;
	public Track() {
		super();
	}
	public Track(String id, String title, int duration) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
