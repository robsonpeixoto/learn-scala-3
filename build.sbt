ThisBuild / scalaVersion := "3.2.2"
ThisBuild / organization := "dev.robsonpeixoto"
ThisBuild / version := "0.1.0-SNAPSHOT"

scalacOptions ++= Seq(
  "-explain",
  "-new-syntax"
  // "-new-syntax",
  // "-indent",
  // "-rewrite"
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "Learn Scala 3",
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M7" % Test
  )
