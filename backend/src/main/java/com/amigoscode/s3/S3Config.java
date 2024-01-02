package com.amigoscode.s3;

public class S3Config {
    public S3Client S3Client(){
        S3Client client = S3Client.builder()
                .region(Region.US_WEST_2)
                .build();
    }
}
