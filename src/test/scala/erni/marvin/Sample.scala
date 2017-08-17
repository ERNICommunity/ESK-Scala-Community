package erni.marvin

object Sample {
  val marvinProject = Project("Marvin",
    List(
      Task("Write algorithm", 10, 60),
      Task("Write test", 10, 30),
      Task("Define basic structure", 10, 20)))
}
