name := "Rewrites-Property"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.2"
libraryDependencies += "org.scalameta" %% "scalameta" % "1.1.0"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M5" cross CrossVersion.full)
