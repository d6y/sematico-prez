name := "scala-presentation"

organization := "underscoreconsulting.com"

version := "0.1"

scalaVersion := "2.10.2"

libraryDependencies += "joda-time" % "joda-time" % "2.3"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
