  name := """play-java-cheapeat"""

  version := "1.0-SNAPSHOT"

  lazy val root = (project in file(".")).enablePlugins(PlayJava)

  scalaVersion := "2.11.7"

  resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)

  resolvers ++= Seq(
    "Apache" at "http://repo1.maven.org/maven2/",
    "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
    "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots"
  )

libraryDependencies ++= Seq(
  evolutions, jdbc,
  // If you enable PlayEbean plugin you must remove these
  // JPA dependencies to avoid conflicts.
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.7.Final",
  "mysql" % "mysql-connector-java" % "5.1.35",
  "com.typesafe.play" %% "play-mailer" % "6.0.1",
  "com.typesafe.play" %% "play-mailer-guice" % "6.0.1",
  "com.amazonaws" % "aws-java-sdk" % "1.11.229",
  "org.mindrot" % "jbcrypt" % "0.3m"
  //"org.hibernate" % "hibernate-core" % "4.2.3.Final"
)


  fork in run := false
