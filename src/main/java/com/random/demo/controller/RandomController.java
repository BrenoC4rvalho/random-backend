package com.random.demo.controller;

import com.random.demo.model.Randomness;
import com.random.demo.repository.RandomRepository;
import com.random.demo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin("http://localhost:3000")
public class RandomController {

    @Autowired
    private RandomRepository randomRepository;

    @PostMapping("/")
    public Randomness create(@RequestBody MultipartFile file, String phrase) {

        if(!file.isEmpty() && phrase != null) {
            PhotoService photo = new PhotoService();
            photo.setPhoto(file, phrase);

            Randomness newRandom = new Randomness(phrase, photo.getPhoto());

            return randomRepository.save(newRandom);
        }

        return null;
    }

    @GetMapping("/")
    public Randomness getRandom() {
        List<Randomness> randomList = randomRepository.findAll();

        Random random = new Random();

        if(randomList.isEmpty()) {
            return null;
        }

        int randomNumber = random.nextInt(randomList.size());

        return randomList.get(randomNumber);
    }
}
