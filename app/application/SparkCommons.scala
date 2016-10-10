package application

import java.util.Properties

import org.apache.spark.sql.{ SQLContext, SparkSession }
import org.apache.spark.{ SparkConf, SparkContext }

trait SparkCommons {
  val databaseURL = "jdbc:postgresql://dbHost:5432/ticketapp"
  val spark = SparkSession
    .builder
    .master("local[*]")
    .appName("tariffPrediction")
    .getOrCreate()

  val connectionProperties = new Properties
  connectionProperties.put("user", "simon")
  connectionProperties.put("password", "root")
}
