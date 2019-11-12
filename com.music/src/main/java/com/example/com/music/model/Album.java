package com.example.com.music.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {
private String name1;
private String genre;
@DBRef
private List<Track> Track;
public Album() {
	super();
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public List<Track> getTrack() {
	return Track;
}
public void setTrack(List<Track> track) {
	Track = track;
}
public Album(String name1, String genre, List<com.example.com.music.model.Track> track) {
	super();
	this.name1 = name1;
	this.genre = genre;
	Track = track;
}
}
