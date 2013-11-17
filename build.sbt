name := "hello"

version := "0.1"

scalaVersion := "2.10.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.2.3"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-slf4j" % "2.2.3"

libraryDependencies +=
    "ch.qos.logback" % "logback-classic" % "1.0.13"

lazy val logback =
  "ch.qos.logback" % "logback-classic" % "1.0.13"