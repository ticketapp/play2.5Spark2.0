package application

import org.apache.spark.sql.{ Encoder, Encoders }

final case class Event(event_facebook_id: String, name: String)

object EventEncoder {
  implicit def eventEncoder: Encoder[Event] = Encoders.kryo[Event]
}
