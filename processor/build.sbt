name := "data-processing"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "1.6.1" copy (isChanging = false),
  "org.apache.spark" %% "spark-streaming" % "1.6.1" copy (isChanging = false),
  "org.apache.spark" %% "spark-streaming-twitter" % "1.6.1" copy (isChanging = false),
  "org.apache.spark" %% "spark-sql" % "1.6.1" copy (isChanging = false),
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" copy (isChanging = false),
  "com.datastax.spark" %% "spark-cassandra-connector" % "1.6.0" copy (isChanging = false),
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test" copy (isChanging = false),
  "com.sksamuel.kafka.embedded" % "embedded-kafka_2.11" % "0.21.0" copy (isChanging = false)
)