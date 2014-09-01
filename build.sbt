net.virtualvoid.sbt.graph.Plugin.graphSettings

organization := "com.github.mengxr"

name := "redshift-input-format"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "1.0.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.0.2" % Test

libraryDependencies += "com.google.guava" % "guava" % "14.0.1" % Test

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.5" % Test
