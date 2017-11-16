package com.dblazejewski.akkaremote.model

object RemoteProtocol {

  case class WorkMessage(msg: String)

  case class StreamWork(nrOfIterations: Long)

  case class DoWork(nrOfIterations: Long)

}
