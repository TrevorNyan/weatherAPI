package example

import example.core.Weather

import scala.concurrent._, duration._

object Hello extends App {
  val w = Await.result(Weather.weather, 10.seconds)
  println(s"Hello! The weather in New York is $w ")
  Weather.http.close()
}