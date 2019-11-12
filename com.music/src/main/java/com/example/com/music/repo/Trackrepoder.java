package com.example.com.music.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.com.music.model.Album;
import com.example.com.music.model.Artist;
import com.example.com.music.model.Track;

@Repository
public class Trackrepoder implements Trackrepo{
	@Autowired
	private MongoTemplate mongo;
	@Override
	public Track create(Track tr) {
		return mongo.save(tr);
	}
	@Override
	public Album create(Album al) {
		return mongo.save(al);
	}
	@Override
	public Artist create(Artist ar) {
		return mongo.save(ar);
	}

	@Override
	public List<Track> findall() {
		return mongo.findAll(Track.class);
	}
	@Override
	public List<Album> findalb() {
		// TODO Auto-generated method stub
		return mongo.findAll(Album.class);
	}
	@Override
	public List<Artist> findart() {
		// TODO Auto-generated method stub
		return mongo.findAll(Artist.class);
	}
	
}
