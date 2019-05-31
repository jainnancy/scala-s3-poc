name := "scala-s3-poc"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.github.seratch" %% "awscala-s3" % "0.8.2",
  "com.typesafe" % "config" % "1.2.1"
)
