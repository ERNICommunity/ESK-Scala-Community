package erni.marvin

import org.scalatest.{FlatSpec, Matchers}

class BasicPlannerTest extends FlatSpec with Matchers {
  def planner: ProjectPlanner = BasicPlanner

  "Estimate executed on empty project" should "return 0" in {
    assert(planner.estimate(Project("empty", Nil)) == 0.0)
  }

  "Estimate executed on marvin project" should "return 70" in {
    assert(planner.estimate(Sample.marvinProject) == 70.0)
  }
}
