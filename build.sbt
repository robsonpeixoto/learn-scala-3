val scala3Version = "3.2.2"

scalacOptions ++= Seq(
  "-explain"
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "Learn Scala 3",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M7" % Test
  )
