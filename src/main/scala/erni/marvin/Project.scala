package erni.marvin

case class Project (name: String, tasks: List[Task])

/**
  * @param name The name
  * @param min Minimum duration in minutes
  * @param max Maximum duration in minutes
  */
case class Task (name: String, min: Double, max: Double)

