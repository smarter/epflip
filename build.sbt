val dottyVersion = "0.4.0-RC1"

lazy val root = (project in file(".")).
  settings(
    name := "epflip",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := dottyVersion,

    libraryDependencies ++= Seq(
      ("de.sciss" %% "scalacollider" % "1.22.4").withDottyCompat()
    )
  )
