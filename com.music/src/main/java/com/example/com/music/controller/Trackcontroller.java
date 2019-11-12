package com.example.com.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.com.music.model.Album;
import com.example.com.music.model.Artist;
import com.example.com.music.model.Track;
import com.example.com.music.repo.Trackrepo;

@RestController
public class Trackcontroller {
	@Autowired
	private Trackrepo repo;
	
	@PostMapping("/tracks")
	public Track create(@RequestBody Track t) {
		return repo.create(t);
	}
	
	@PostMapping("/artists")
	public Artist create1(@RequestBody Artist a) {
		return repo.create(a);
	}
	
	@PostMapping("/albums")
	public Album create2(@RequestBody Album al) {
		return repo.create(al);
	}
	
	@GetMapping("/tracks")
	public List<Track> create() {
		return repo.findall();
	}
	@GetMapping("/artists")
	public List<Artist> create1() {
		return repo.findart();
	}
	@GetMapping("/albums")
	public List<Album> create2() {
		return repo.findalb();
	}
	
}
