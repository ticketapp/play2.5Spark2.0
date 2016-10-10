import play.sbt.PlayScala

name         := "TariffPrediction"
version      := "0.0.1"
scalaVersion := Version.scala

resolvers := ("Atlassian Releases" at "https://maven.atlassian.com/public/") +: resolvers.value

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += Resolver.sonatypeRepo("snapshots")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

lazy val root = (project in file("."))
  .settings(scalaVersion := Version.scala)
  .enablePlugins(PlayScala)

libraryDependencies ++= Dependencies.dependencies

dependencyOverrides ++= Set(
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.4",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.7.4"
)

releaseSettings

scalariformSettings
