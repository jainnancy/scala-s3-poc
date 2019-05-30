package utils

import awscala.Region0
import awscala.s3.S3
import com.amazonaws.services.s3.model.S3Object
import com.amazonaws.services.s3.AmazonS3URI

object S3Utility extends App {

  implicit val region = Region0.US_EAST_1
  val s3Client = S3.apply()

  println(s"!!!!!!!!!!!!!!!! $s3Client")
  val s3URI: AmazonS3URI = new AmazonS3URI("s3://test-js-knoldus/test-js-document")

  println(s"%%%%%%% $s3URI")

  val a: S3Object = s3Client.getObject(s3URI.getBucket, s3URI.getKey)
  println("@@@@@@@@@@@@@@" + a)
//  println(">>>>>>>>>>>>"+s3Client.buckets)

//  println(s3Client.createBucket("test-from-code"))

}
