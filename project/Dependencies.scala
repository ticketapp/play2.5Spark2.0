import sbt._

object Version {
  val scala            = "2.11.8"
  val spark            = "2.0.0"
  val postgreSQL       = "9.4.1211.jre7"
}

object Library {
  val sparkSQL          = "org.apache.spark"            %% "spark-sql"          % Version.spark
  val sparkMLLib        = "org.apache.spark"            %% "spark-mllib"        % Version.spark
  val sparkCore         = "org.apache.spark"            %% "spark-core"         % Version.spark
  val postgreSQL        = "org.postgresql"              %  "postgresql"         % Version.postgreSQL
}

object Dependencies {
  import Library._

  val dependencies = Seq(
    sparkSQL,
    sparkMLLib,
    sparkCore,
    postgreSQL)
}
