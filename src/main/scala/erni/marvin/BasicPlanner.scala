package erni.marvin

/**
  * Created by martin on 8/17/17.
  */
object BasicPlanner extends ProjectPlanner {

  override def estimate(project: Project): Double = {
    val totalMin = project.tasks.map(_.min).sum
    val totalMax = project.tasks.map(_.max).sum

    (totalMin + totalMax) / 2.0
  }
}
