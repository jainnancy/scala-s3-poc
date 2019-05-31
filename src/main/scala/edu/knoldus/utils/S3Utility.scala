package edu.knoldus.utils

import java.io.File

import awscala.s3.S3
import com.amazonaws.services.s3.AmazonS3URI
import com.amazonaws.services.s3.model.GetObjectRequest

object S3Utility {

  def getS3ObjectByURI(s3Client: S3, s3BucketURL: String, targetLocation: String) = {

    val s3URI: AmazonS3URI = new AmazonS3URI(s3BucketURL)
    println("s3URI : " + s3URI)

    val s3BucketName: String = s3URI.getBucket
    println("s3BucketName : " + s3BucketName)

    val s3Key = s3URI.getKey
    println("s3Key : " + s3Key)

    val getObjectRequest = new GetObjectRequest(s3BucketName, s3Key)
    println("getObjectRequest : " + getObjectRequest)

    val file = new File(targetLocation)
    println("file : " + file)

    println(s3Client.getObject(getObjectRequest, file))
  }
}
