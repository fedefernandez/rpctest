ThisBuild / scalaVersion := "2.12.7"

val muVersion = "0.18.1-SNAPSHOT"

lazy val rpctest = (project in file("modules/rpctest/app"))
  .settings(
    name := "RPCTest",

    resolvers += Resolver.sonatypeRepo("snapshots"),

    libraryDependencies += "io.higherkindness" %% "mu-rpc-channel" % muVersion,
    libraryDependencies += "io.higherkindness" %% "mu-rpc-server" % muVersion,

    idlType := "proto",

    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1"
      cross CrossVersion.patch)
  )
