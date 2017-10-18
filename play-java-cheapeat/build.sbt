  name := """play-java-cheapeat"""

  version := "1.0-SNAPSHOT"

  lazy val root = (project in file(".")).enablePlugins(PlayJava)

  scalaVersion := "2.11.7"

  resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
  evolutions, jdbc,
  // If you enable PlayEbean plugin you must remove these
  // JPA dependencies to avoid conflicts.
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.7.Final",
  "mysql" % "mysql-connector-java" % "5.1.35"
  //"org.hibernate" % "hibernate-core" % "4.2.3.Final"
)




  fork in run := true
