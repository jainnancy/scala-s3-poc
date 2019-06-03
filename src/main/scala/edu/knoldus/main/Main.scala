package edu.knoldus.main

import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.s3.AmazonS3Client
import edu.knoldus.ApplicationConfig._
import edu.knoldus.utils.S3Utility._

object Main extends App {

  val awsCredentials = new BasicAWSCredentials(access_key_ID, secret_access_key)

  val amazonS3Client: AmazonS3Client = new AmazonS3Client(awsCredentials)

  getS3ObjectBySignedURI(amazonS3Client, s3_bucket_uri, target_location)
}
