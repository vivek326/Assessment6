package com.example.com.music.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artist {
private String id;
private String name;
@DBRef
private List<Album> Album;
public Artist() {
	super();
}
public Artist(String id, String name, List<com.example.com.music.model.Album> album) {
	super();
	this.id = id;
	this.name = name;
	Album = album;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Album> getAlbum() {
	return Album;
}
public void setAlbum(List<Album> album) {
	Album = album;
}
}
