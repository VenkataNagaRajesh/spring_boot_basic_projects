package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Tutorial;
import com.example.Repository.TutorialRepository;

@RestController
@RequestMapping("/api")
public class TutorialController {
	
	@Autowired
	TutorialRepository tr;
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial)throws Exception
	{
//		try {
			Tutorial tutorials=tr.save(tutorial);
			return new ResponseEntity<>(tutorials,HttpStatus.CREATED);
//		}
//		catch(Exception e)
//		{
//			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
//		}

	}
	
	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutotial(@RequestParam(required=false) String title)
	{
		try {
			List<Tutorial> tutorial=new ArrayList<Tutorial>();
			
			if(title==null)
				tr.findAll().forEach(tutorial::add);
			else
				tr.findByTitleContaining(title).forEach(tutorial::add);
			
			if(tutorial.isEmpty())
			{
				//return new ResponseEntity<>(HttpStatus.No_CONTENT);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tutorial,HttpStatus.NO_CONTENT);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("tutorials/{id}")
	public ResponseEntity<Tutorial> getTutorialsById(@PathVariable("id") UUID id)
	{
		Optional<Tutorial> tutorialDate=tr.findById(id);
		if(tutorialDate.isPresent())
		{
			return new ResponseEntity<>(tutorialDate.get(),HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	@GetMapping("/tutorials/published")
	public ResponseEntity<List<Tutorial>> findByPublished()
	{
		try {
			List<Tutorial> tutorials=tr.findByPublished(true);
			if(tutorials.isEmpty())
			{
				return new ResponseEntity<>(HttpStatus.OK);
			}
			return new ResponseEntity<>(tutorials,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
	@PutMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") UUID id,@RequestBody Tutorial tutorial)
	{
		Optional<Tutorial> tutorialData=tr.findById(id);
		if(tutorialData.isPresent())
		{
			Tutorial tutorials=tutorialData.get();
			tutorials.setTitle(tutorial.getTitle());
			tutorials.setDescription(tutorial.getDescription());
			tutorials.setPublished(tutorial.isPublished());
			return new ResponseEntity<>(tr.save(tutorials),HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id")UUID id)
	{
		try {
				
			tr.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("turoials")
	public ResponseEntity<HttpStatus> deleteAllTutorials()
	{
		try {
			tr.deleteAll();
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}