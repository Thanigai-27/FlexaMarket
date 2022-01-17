package com.example.flexa.service;

import com.example.flexa.model.Media;
import com.example.flexa.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaServiceImpl implements MediaService {
    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public Media saveMedia(Media media){return mediaRepository.save(media);}
    @Override
    public List<Media> getAllMedias(){return mediaRepository.findAll();}
    @Override
    public Media getMediaById(Long id){return mediaRepository.getById(id);}
    @Override
    public void deleteMediaById(Long id){mediaRepository.deleteById(id);}
}
