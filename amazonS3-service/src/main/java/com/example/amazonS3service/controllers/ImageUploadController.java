package com.example.amazonS3service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;

import java.io.IOException;

@RestController
public class ImageUploadController {
    @Autowired
    private S3Client s3Client;
    @Value("${aws.bucketName}")
    private String bucketName;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Tạo tên file duy nhất
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());

            // Tạo yêu cầu để đẩy file lên S3
            PutObjectRequest request = PutObjectRequest.builder()
                    .bucket(bucketName)
                    .key(fileName)
                    .contentType(file.getContentType())
                    .build();

            // Đọc nội dung file và đẩy lên S3
            PutObjectResponse response = s3Client.putObject(request, SdkBytes.fromInputStream(file.getInputStream()));

            // Lấy đường dẫn truy cập file
            String fileUrl = "https://" + bucketName + ".s3." + s3Client.restoreObject().toString() + ".amazonaws.com/" + fileName;

            return ResponseEntity.ok(fileUrl);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi khi tải file lên S3");
        }
    }
}
