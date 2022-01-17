package com.example.flexa.service;

import com.example.flexa.model.Media;

import java.util.List;

public interface MediaService {
    Media saveMedia(Media media);
    List<Media> getAllMedias();
    Media getMediaById(Long id);
    void deleteMediaById(Long id);
}
