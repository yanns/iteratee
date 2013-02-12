name := "A Project"

version := "0.1"

scalaVersion := "2.10.0"

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "play" % "play-iteratees_2.10" % "2.1.0"
)
