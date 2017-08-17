package erni.marvin

trait ProjectPlanner {
  /**
    * @param project The project
    * @return Expected duration in minutes
    */
  def estimate(project: Project): Double
}
