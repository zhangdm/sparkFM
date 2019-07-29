name := "spark-fm"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.1.1"

// spark version to be used
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "com.github.scopt" %% "scopt" % "3.4.0",
  "org.slf4j" % "slf4j-simple" % "1.6.4"
)