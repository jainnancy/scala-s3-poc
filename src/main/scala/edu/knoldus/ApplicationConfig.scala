package edu.knoldus

import com.typesafe.config.ConfigFactory

object ApplicationConfig {

  val config = ConfigFactory.load()

  val access_key_ID: String = config.getString("aws.access-key-id")
  val secret_access_key: String = config.getString("aws.access-key-id")
  val s3_bucket_uri: String = config.getString("aws.s3-bucket-uri")
  val target_location: String = config.getString("target-location")
}
