resolvers += Resolver.bintrayRepo("colisweb", "sbt-plugins")

addSbtPlugin("com.timushev.sbt"          % "sbt-updates"   % "0.5.1")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"  % "2.4.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"  % "0.1.13")
addSbtPlugin("pl.project13.scala"        % "sbt-jmh"       % "0.3.4")
addSbtPlugin("org.scoverage"             % "sbt-scoverage" % "1.6.1")
addSbtPlugin("com.github.gseitz"         % "sbt-release"   % "1.0.10")
addSbtPlugin("org.foundweekends"         % "sbt-bintray"   % "0.5.6")
