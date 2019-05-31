package edu.knoldus.main

import awscala.Region0
import awscala.s3.S3
import edu.knoldus.ApplicationConfig._
import edu.knoldus.utils.S3Utility.getS3ObjectByURI

object Main extends App {

  implicit val region = Region0.US_EAST_1

  private val s3Client: S3 = S3.apply(access_key_ID, secret_access_key)

  getS3ObjectByURI(s3Client, s3_bucket_uri, target_location)

}
