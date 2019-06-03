name := "scala-s3-poc"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.11.46",
  "com.typesafe" % "config" % "1.2.1"
)
