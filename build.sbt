name := "common-model"

version := "1.1"

scalaVersion := "2.11.11"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

resolvers += "local-central" at "http://192.168.1.100:8081/nexus/content/repositories/releases/"

externalResolvers <<= resolvers map { rs =>
  Resolver.withDefaultResolvers(rs, mavenCentral = false)
}

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
)

publishArtifact in Test := false
publishMavenStyle := true
pomIncludeRepository := { _ => false }
pomExtra := <url>http://blog.dblazejewski.com</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
    </license>
  </licenses>
  <scm>
    <connection></connection>
    <developerConnection></developerConnection>
    <url></url>
  </scm>
  <developers>
    <developer>
      <id></id>
      <name></name>
      <url></url>
    </developer>
  </developers>

publishTo := Some("nexus" at "http://192.168.1.100:8081/nexus/content/repositories/releases/")