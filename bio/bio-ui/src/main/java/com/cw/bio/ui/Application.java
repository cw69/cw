package com.cw.bio.ui;

import com.cw.bio.bi.PhotoUploadService;
import com.cw.bio.bi.PhotoUploadServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public PhotoUploadService getPhotoUploadService(){
        return new PhotoUploadServiceImp();
    }
}
