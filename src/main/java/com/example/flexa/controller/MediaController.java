package com.example.flexa.controller;


import com.example.flexa.model.Media;
import com.example.flexa.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/media")
public class MediaController {
    @Autowired
    private MediaService mediaService;

    @PostMapping("/")
    private ResponseEntity<Media> saveMedia(@RequestBody Media media){
        return new ResponseEntity<Media>(mediaService.saveMedia(media), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<Media> getAllMedias(){
        return mediaService.getAllMedias();
    }
    @RequestMapping("/{id}")
    private ResponseEntity<Media> getMediaById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<Media>(mediaService.getMediaById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Media>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteMediaById(@PathVariable("id") Long id){
        mediaService.deleteMediaById(id);
    }

}
