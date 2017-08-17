package erni.marvin

import org.scalatest.{FlatSpec, Matchers}

class BasicPlannerTest extends FlatSpec with Matchers {
  def planner: ProjectPlanner = BasicPlanner

  "Estimate executed on Sample" should "return a value between sum of minimums and sum of maximums" in {
    planner.estimate(Sample.marvinProject) should (be >= 30.0 and be <= 110.0)
  }

  "Estimate executed on empty project" should "return 0" in {
    assert(planner.estimate(Project("empty", Nil)) == 0.0)
  }
}
