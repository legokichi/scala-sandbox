name := "scala-sandbox"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.2.0",
  "org.scalaz" %% "scalaz-core" % "7.2.14"
)
