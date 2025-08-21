   package com.example.ai.controller;

   import com.example.ai.dto.UploadResponse;
   import org.springframework.web.bind.annotation.*;

   @RestController
   @RequestMapping("/api/resumes")
   public class ResumeController {
       @PostMapping("/upload")
       public UploadResponse uploadResume(@RequestParam("file") String file) {
           // Logic to handle file upload
           return new UploadResponse("File uploaded successfully");
       }
   }
   