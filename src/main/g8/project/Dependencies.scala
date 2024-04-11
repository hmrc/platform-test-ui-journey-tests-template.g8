import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "ch.qos.logback"       % "logback-classic" % "1.5.4"  % Test,
    "com.vladsch.flexmark" % "flexmark-all"    % "0.64.8" % Test,
    "org.scalatest"       %% "scalatest"       % "3.2.18" % Test,
    "uk.gov.hmrc"         %% "ui-test-runner"  % "0.24.0" % Test
  )

}
