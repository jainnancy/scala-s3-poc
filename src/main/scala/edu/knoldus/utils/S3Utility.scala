package edu.knoldus.utils

import java.io.File

import com.amazonaws.services.s3.model.GetObjectRequest
import com.amazonaws.services.s3.{AmazonS3Client, AmazonS3URI}

object S3Utility {

  def getS3ObjectBySignedURI(amazonS3Client: AmazonS3Client, s3BucketURL: String, targetLocation: String) = {

    val s3URI: AmazonS3URI = new AmazonS3URI(s3BucketURL)

    println("s3URI : " + s3URI)

    val s3BucketName: String = s3URI.getBucket
    println("s3BucketName : " + s3BucketName)

    val s3Key: String = s3URI.getKey
    println("s3Key : " + s3Key)

    val getObjectRequest = new GetObjectRequest(s3BucketName, s3Key)
    println("getObjectRequest : " + getObjectRequest)

    val file = new File(targetLocation + s3Key)
    println("file : " + file)

    println(">>>>>>>>>>>>"+amazonS3Client.getObject(getObjectRequest, file))
  }
}
