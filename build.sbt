ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file("."))
  .settings(
    name := "Sandbox",
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
    )
  )
