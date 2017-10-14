  name := """play-java-cheapeat"""

  version := "1.0-SNAPSHOT"

  lazy val root = (project in file(".")).enablePlugins(PlayJava)

  scalaVersion := "2.11.7"

<<<<<<< HEAD
libraryDependencies ++= Seq(
  // If you enable PlayEbean plugin you must remove these
  // JPA dependencies to avoid conflicts.
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.7.Final",
  "mysql" % "mysql-connector-java" % "5.1.35"
  //"org.hibernate" % "hibernate-core" % "4.2.3.Final"
)
=======
  libraryDependencies ++= Seq(
    // If you enable PlayEbean plugin you must remove these
    // JPA dependencies to avoid conflicts.
    javaJpa,
    "org.hibernate" % "hibernate-entitymanager" % "4.3.7.Final"
  )
>>>>>>> e434468be8ffa6034b90ccf1cdf241f7fe16c5e9



  fork in run := true