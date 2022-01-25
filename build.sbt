ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaSpark",
    libraryDependencies += "org.apache.spark" %% "spark-core" % "3.2.0",
    libraryDependencies += "org.apache.spark" %% "spark-graphx" % "3.2.0",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.0" % "provided",
    libraryDependencies += "org.apache.spark" %% "spark-mllib" % "3.2.0" % "provided",
      libraryDependencies += "org.scalafx" %% "scalafx" % "17.0.1-R26"

  )
