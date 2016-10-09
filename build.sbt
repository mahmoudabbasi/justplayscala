name := "justplayscala"

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

//libraryDependencies ++= Seq(
//  jdbc,
//  "com.typesafe.play" %% "anorm" % "2.5.0"
//)


libraryDependencies ++= Seq(jdbc, anorm, cache, ws)

fork in run := true