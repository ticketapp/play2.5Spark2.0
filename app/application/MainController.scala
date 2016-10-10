package application

import org.apache.spark.sql._
import play.api.mvc.{ Action, Controller }

import scala.language.{ implicitConversions, postfixOps }

class MainController extends Controller with SparkCommons {
  import EventEncoder._
  import spark.implicits._

  val lines = spark
    .read
    .format("csv")
    .option("header", "true")
    .load("data/data.csv")

  //Works well
  val df = lines.toDF()
  df.printSchema()
  df.as[(String, String)].show()

  //df.as[Event] does not work as well
  val ds: Dataset[Event] = lines.as[Event]
  ds.collect()

  def index = Action { Ok }
}
