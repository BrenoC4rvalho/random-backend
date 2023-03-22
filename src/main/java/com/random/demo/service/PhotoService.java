package com.random.demo.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PhotoService {

    private static String basePath = "C:\\Users\\Samsung\\3D Objects\\random-frontend\\public\\img\\";
    private String photo;
    public void setPhoto(MultipartFile file, String phrase) {

        try {
            if(!file.isEmpty()) {
                byte[] bytes = file.getBytes();
                Path path = Paths.get(basePath+phrase+".jpg");
                Files.write(path, bytes);
                this.photo = phrase+".jpg";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getPhoto() {
        return photo;
    }
}
