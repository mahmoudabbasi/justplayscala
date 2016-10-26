name := "justplayscala"

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

//libraryDependencies ++= Seq(
//  jdbc,
//  "com.typesafe.play" %% "anorm" % "2.5.0"
//)


libraryDependencies ++= Seq(jdbc, anorm, cache, ws)



libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.slick" %% "slick" % "2.0.0",
  "com.typesafe.slick" %% "slick-extensions" % "2.0.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.175",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

fork in run := true